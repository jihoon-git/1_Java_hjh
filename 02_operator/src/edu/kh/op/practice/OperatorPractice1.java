package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("인원수 : ");
		int input1 = sc.nextInt();

		System.out.println("사탕 개수 : ");
		int input2 = sc.nextInt();
		
		
		System.out.println("1인당 사탕 개수 : " + (input2/input1));
		System.out.println("남는 사탕 개수 : " + (input2%input1));
		
	}

}
