package EnglishWord;

import java.io.*;
import java.util.*;

/*화은이는 이번 영어 시험에서 틀린 문제를 바탕으로 영어 단어 암기를 하려고 한다. 그 과정에서 효율적으로 영어 단어를 외우기 위해 영어 단어장을 만들려 하고 있다. 화은이가 만들고자 하는 단어장의 단어 순서는 다음과 같은 우선순위를 차례로 적용하여 만들어진다.

자주 나오는 단어일수록 앞에 배치한다.
해당 단어의 길이가 길수록 앞에 배치한다.
알파벳 사전 순으로 앞에 있는 단어일수록 앞에 배치한다
 
$M$보다 짧은 길이의 단어의 경우 읽는 것만으로도 외울 수 있기 때문에 길이가 
$M$이상인 단어들만 외운다고 한다. 화은이가 괴로운 영단어 암기를 효율적으로 할 수 있도록 단어장을 만들어 주자.*/

public class EnglishWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력: 단어의 개수 'n'과 최소 단어 길이 'm'을 읽음
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        // HashMap을 사용하여 길이가 'm' 이상인 단어들과 그 개수를 저장
        Map<String, Integer> map = new HashMap<>();
        
        // 'n'개의 단어를 읽으며, 길이가 'm' 이상인 단어의 등장 횟수를 세어 map에 저장
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.length() < m) continue; // 길이가 'm' 미만인 단어는 무시
            map.put(s, map.getOrDefault(s, 0) + 1); // 이미 나온 단어인 경우 카운트 증가, 처음 나온 단어인 경우 1로 설정
        }
        
        // map에서 단어들을 가져와서 ArrayList에 저장
        List<String> words = new ArrayList<>(map.keySet());
        
        // words 리스트를 정렬
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 자주 등장하는 단어 순서대로 정렬
                if (Integer.compare(map.get(o1), map.get(o2)) != 0) {
                    return Integer.compare(map.get(o2), map.get(o1));
                }
                // 등장 횟수가 같으면 길이가 긴 단어가 먼저 오도록 정렬
                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }
                // 등장 횟수와 길이가 같으면 사전 순으로 정렬
                return o1.compareTo(o2);
            }
        });
        
        // 정렬된 단어들을 출력
        StringBuilder sb = new StringBuilder();
        for (String str : words) {
            sb.append(str + "\n");
        }
        System.out.println(sb);
    }
}