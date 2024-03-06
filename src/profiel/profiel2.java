package profiel;

import java.util.*;
import java.io.*;

/*첫 번째 줄에는 채팅방의 기록 수를 나타내는 정수 
$N$ 이 주어진다. (
$1 \le N \le 100\,000$)

두 번째 줄부터 
$N$ 개의 줄에 걸쳐 새로운 사람의 입장을 나타내는 ENTER, 혹은 채팅을 입력한 유저의 닉네임이 문자열로 주어진다. (문자열길이
$1 \le \texttt{문자열 길이} \le 20$)

첫 번째 주어지는 문자열은 무조건 ENTER이다.*/

public class profiel2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<String> list = new HashSet<>();
		
		int Num = Integer.parseInt(bf.readLine());
		int count = 0;
		
		for(int i = 0; i < Num; i++) {
			String st = bf.readLine();
			//중간에 NETER가 있으면 리스트의 크기를 더하고 삭제
			if(st.equals("ENTER")) {
				count += list.size();
				list.clear();
			}
			else {
				list.add(st);
			}
			
		}
		//ENTER가 한번만 나올 수 있으므로 마지막으로 사이즈 확인 후 count에 더함
		count = count + list.size();
		System.out.print(count);
	}
}
