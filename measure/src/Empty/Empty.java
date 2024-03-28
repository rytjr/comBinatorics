package Empty;

import java.util.*;
import java.io.*;

/*양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다. 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.*/

public class Empty {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		
		int list[] = new int[Num];
		
		for(int i = 0; i < Num; i++) {
			list[i] = sc.nextInt();
		}
		
		//약수가 1일 경우 제곱
		if(list.length == 1) {
			System.out.print(list[0] * list[0]);
		}
		// 2개일 경우 둘을 곱
		else if(list.length == 2) {
			System.out.print(list[0] * list[1]);
		}
		else {
			//가장 큰 수와 가장 작은 수를 곱
			int sum = list[0];
			int min = list[0];
			for(int j = 0; j < list.length; j++) {
				if(sum < list[j]) {
					sum = list[j];
				}
				if(min > list[j]) {
					min = list[j];
				}
			}
			
			System.out.print(min * sum);
		}
		
	}
}