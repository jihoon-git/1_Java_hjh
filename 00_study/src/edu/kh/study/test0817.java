package edu.kh.study;

import java.util.Scanner;

public class test0817 {

	public void ex1() {
		// 연산자 실습문제 1
//		모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
//		1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
//		[실행화면]
//		인원 수 : 29
//		사탕 개수 : 100
//		1인당 사탕 개수 : 3
//		남는 사탕 개수 : 13
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원수 : ");
		int people = sc.nextInt();
		
		System.out.println("사탕 개수: ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (candy/people));
		System.out.println("남는 사탕 개수 : " + (candy%people));	
	}
	
	public void ex2(){
		// 연산자 실습문제3
//		정수를 하나 입력 받아 양수/음수/0 을 구분하세요.
//		[실행화면]
//		정수 입력 : 3
//		양수 입니다.
//		정수 입력 : -5
//		음수 입니다.
//		정수 입력 : 0
//		0 입니다.
		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		
		if(input==0) {
			System.out.println("0 입니다.");
		} else if(input>0) {
			System.out.println("양수 입니다.");
		} else {
			System.out.println("음수 입니다.");
		}
	}
	
	public void ex3() {
		//연산자 실습문제4
//		국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
//		세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
//		세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
//		세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
//		ex.
//		국어 : 60
//		영어 : 80
//		수학 : 40
//		합계 : 180
//		평균 : 60.0
//		합격
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		
		System.out.println("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = (double)sum/3.0;
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		
		if(kor>=40&&eng>=40&&math>=40&&avg>=60.0) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}

	public void ex4() {
		//branch, array 풀어볼 것....
		
		
	}

}
