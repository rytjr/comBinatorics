package Factorial;

import java.util.*;

/*0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.*/

public class Factorial {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		
		int count = 1;
		
		for(int i = 1; i < Num + 1; i++) {
			count *= i;
		}
		
		System.out.print(count);
	}

}
