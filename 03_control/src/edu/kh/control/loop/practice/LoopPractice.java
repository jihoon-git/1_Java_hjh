package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {

	// 실습문제 1~13
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
							
		if(input<1) {
				System.out.print("1이상의 숫자를 입력해주세요.");
		} else {
				for(int i=1; i<=input; i++) {
				System.out.print(i+" ");
				}
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input<1) {
			System.out.print("1이상의 숫자를 입력해주세요.");
		} else {
			for(int i=input; i>=1; i--) {
			System.out.print(i+" ");
			}
		}
	}
	
	public void practice3() { //풀이 체크할 것
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요. : ");
		int input = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<=input; i++) {
			System.out.print(i+" ");

			
		}
	}
	
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1<1||num2<1) {
			System.out.print("1이상의 숫자를 입력해주세요.");
			} else { // 둘 다 1 미만이 아니다
					//8    4
				if(num1 > num2) { 

					// 두 변수의 값 교환
					int temp = num1;  //  temp : 8 / num1 : 8 / num2 : 4
					num1 = num2; //  temp : 8 / num1 : 4 / num2 : 4
					num2 = temp; //  temp : 8 / num1 : 4 / num2 : 8
				}

				for(int i=num1 ; i<=num2 ; i++) {
					System.out.print(i + " ");
				}
				
			}				
				

/*				int start =num1;
				int end = num2;
				
				if(num1>num2) { //먼저 입력한 숫자가 크면 start / end를 바꿈
					start=num2;
					end=num1;
				}
				
				for(int i = start; i<=end;i++){
					System.out.println(i+" ");
				}
*/
				
				
// 내가 푼 방법			
/*				if(input1<input2) {
				for(int i=input1; i<=input2; i++) {
				System.out.print(i+" ");}}
				else {
				for(int i=input2; i<=input1; i++) {
				System.out.print(i+" ");
					}
				}
			}
*/	
		
		
		}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자: ");

		int dan = sc.nextInt();
		
		System.out.println("===== "+ dan +"단 =====");
			
			for(int i = 1; i<=9;i++) {
				System.out.printf("%d * %d = %d \n", dan, i, dan*i);
				}
				
		}
	
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자: ");

		int dan = sc.nextInt();
		if(dan<2||dan>9) { 
			System.out.println("2~9 사이 숫자만 입력해 주세요.");
		} else {

			for(int x=dan;x<=9;x++) {
				System.out.println("===== "+ x +"단 =====");
			
				for(int i = 1; i<=9;i++) {
				System.out.printf("%d * %d = %2d \n", x, i, x*i);
				}
				System.out.println(); // 단 사이 줄바꿈
			}
		}
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1; row<=input; row++) {
			
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=input; row>=1; row--) {
			
			for(int col=row;col>=1;col--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1; row<=input; row++) {
			
			// for문을 이용한 풀이 _ 내가 풀다가 실패한 것
//			for(int i=input-1; i>=row;i--)			
//			for(int i=input-row; i>=1;i--) {
//				System.out.print(" ");
//				}
//			
//			for(int col=1;col<=row;col++) {
//				System.out.print("*");
	
			// if문을 이용한 풀이
			for(int col=1;col<=input;col++) {
				
				if(col<=input-row){
					System.out.print(" ");
				}else {
					System.out.print("*");					
				}

			}
			System.out.println(); //줄바꿈
		}
		
	}
	
	public void practice10() { //2번 풀이 다시 볼 것
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 위쪽 삼각형
		for(int row=0; row<=input;row++) {
			
			for(int col=1; col<=row; col++) {
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
		}
		
		// 아래쪽 삼각형

		for(int row=input-1; row>=1;row--) {
			
			for(int col=1; col<=row; col++) {
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
		}
		
		System.out.println("===============================");
		
		
		// 풀이2
		
		
	}
	
	
	
	public void practice11() { //9번 응용 //for문 풀이 다시 볼 것
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1; row<=input; row++) {
			
			// for문을 이용한 풀이 
////			for(int i=input-1; i>=row;i--)			
//			for(int i=input-row; i>=1;i--) {
//				System.out.print(" ");
//				}
//			
//			for(int col=1;col<=row*2-1;col++) {
//				System.out.print("*");
//			}
//			

					
			// if문을 이용한 풀이
			for(int col=1;col<=input*2-1;col++) {
				
				if(col<=input-row||input+row<=col){
					System.out.print(" ");
				}else {
					System.out.print("*");					
				}

			}
			System.out.println(); //줄바꿈
		}
	}
	
		

	public void practice12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1;row<=input;row++) {
			for(int col=1;col<=input;col++) {
				
				//첫번째 / 마지막 줄, 칸일때만 * 출력
				if(row==1||row==input||col==1||col==input) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		int count=0;
		
		for(int i=1;i<=input;i++) {
			
			//2의 배수 또는 3의 배수인 경우 출력
			if(i%2==0||i%3==0) {
				System.out.print(i+" ");
				
				//2와 3의 공배수 == 2로도 나누어 떨어지고, 3으로도 나누어 떨어진다
				if(i%2==0 && i%3==0) {
					count++; //count 증가
				}
			}
		}
		System.out.println("\ncount : "+count);
		
	}
	
	
}

