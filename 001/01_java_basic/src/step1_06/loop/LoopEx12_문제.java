package step1_06.loop;

import java.util.Scanner;

/*
 * 
 * 4:00~21
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */

public class LoopEx12_문제 {


	public static void main(String[] args) {
		int number = 1;
		int turn = 0;
		Scanner scan = new Scanner(System.in);
		while(turn <= 49) {
			if(number%3==0){
				System.out.println("짝");
				number=number+1;
				turn =turn+ 1;
				
			}
			else {
				System.out.println(number);
				number=number+1;
				turn =turn+ 1;
			}
			
		}
		
		scan.close();
		
	}

}
