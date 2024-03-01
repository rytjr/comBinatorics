package GreenTower;

import java.util.*;

/*그림의 시야에 보이지 않는 블록은 없다.
그림의 시야에 보이는 블록의 윗면만 이용해 녹색거탑을 내려올 수 있다.
녹색거탑이 
$N$층이면, 총 
$N$개의 블록을 이용한 최단 경로로만 내려온다.
녹색거탑을 내려올 때는 정상에서 시작해 노란색 바닥까지, 항상 인접한 아래층의 블록으로만 내려온다.*/

public class GreenTower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		int count = 1;
		
		for(int i = 0; i < Num; i++) {
			count = count * 2;
		}
		System.out.print(count);
	}

}
