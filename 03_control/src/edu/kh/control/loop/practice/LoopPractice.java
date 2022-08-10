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
	
	public void practice3() { //?????
		
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
		int input1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int input2 = sc.nextInt();
		
		if(input1<1||input2<1) {
			System.out.print("1이상의 숫자를 입력해주세요.");
			} else {
				if(input1<input2) {
				for(int i=input1; i<=input2; i++) {
				System.out.print(i+" ");}}
				else if (input1>input2){
				for(int i=input2; i<=input1; i++) {
				System.out.print(i+" ");
					}
				}
			}
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
				System.out.printf("%d * %d = %d \n", x, i, x*i);
				}
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
	
	public void practice9() { // ??????????????
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1; row<=input; row++) {
			
			for(int blc=input-1; blc>=1;blc--) {
				System.out.print(" ");
				}
			
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
	
	public void practice10() {}
	public void practice11() {}
	public void practice12() {}
	
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
	}
	
	
}

