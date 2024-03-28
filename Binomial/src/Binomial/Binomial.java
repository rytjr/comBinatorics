package Binomial;

import java.util.*;

/*자연수 
\(N\)과 정수 
\(K\)가 주어졌을 때 이항 계수 
\(\binom{N}{K}\)를 구하는 프로그램을 작성하시오.*/

public class Binomial {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		int Num2 = sc.nextInt();
		int count = 1;
		int count2 = 1;
		
		for(int i = 0; i < Num2; i++) {
			count *= (Num - i);
			count2 *= (i + 1);
		}
		
		System.out.print(count/count2);
	}

}
