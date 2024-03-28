package Dancd;

import java.io.*;
import java.util.*;

/*첫번째 줄에는 사람들이 만난 기록의 수 
$N\ (1 \le N \le 1\ 000)$이 주어진다.

두번째 줄부터 
$N$개의 줄에 걸쳐 사람들이 만난 기록이 주어진다. 
$i + 1$번째 줄에는 
$i$번째로 만난 사람들의 이름 
$A_i$와 
$B_i$가 공백을 사이에 두고 주어진다. 
$A_i$와 
$B_i$는 숫자와 영문 대소문자로 이루어진 최대 길이 
$20$의 문자열이며, 서로 같지 않다.

총총이의 이름은 ChongChong으로 주어지며, 기록에서 1회 이상 주어진다.

동명이인은 없으며, 사람의 이름은 대소문자를 구분한다. (ChongChong과 chongchong은 다른 이름이다.)*/

public class Dancd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        set.add("ChongChong");  //총총이는 무조건 나오므로 추가
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String person1 = st.nextToken();
            String person2 = st.nextToken();
            //춤을 추고 있는 사람을 만나면 춤을 추게 되므로 세트에 추가
            if (set.contains(person1) || set.contains(person2)) {
                set.add(person1);
                set.add(person2);
            }
        }
        System.out.println(set.size());
    }



}
