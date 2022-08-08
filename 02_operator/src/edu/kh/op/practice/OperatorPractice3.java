package edu.kh.op.practice;
import java.util.Scanner;

public class OperatorPractice3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		
		int input1 = sc.nextInt();
		
		String result1 = (input1==0) ? "0" : (input1>0? "양수" : "음수"); 
		
		System.out.println(result1+"입니다.");
				
		System.out.print("정수 입력 : ");
		
		int input2 = sc.nextInt();
		
		String result2 = (input2==0) ? "0" : (input2>0? "양수" : "음수");
		
		System.out.println(result2+"입니다.");
		
		System.out.print("정수 입력 : ");
		
		int input3 = sc.nextInt();
		
		String result3 = (input3==0) ? "0" : (input3>0? "양수" : "음수");
		
		System.out.println(result3+"입니다.");
		
		
	}

}
