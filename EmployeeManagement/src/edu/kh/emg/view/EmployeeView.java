package edu.kh.emg.view;

import java.util.Scanner;

import edu.kh.emg.model.vo.Employee;

public class EmployeeView {

	private Scanner sc = new Scanner(System.in);
	private Employee emp = new Employee();
	
	public void displayMenu() {
		
		int input = 0;
		
		do {
			
			System.out.println("\n======= 사원 관리 프로그램 =======");
			
			System.out.println("1. 새로운 사원 정보 추가");

			System.out.println("2. 전체 사원 정보 조회");

			System.out.println("3. 사번이 일치하는 사원 정보 조회");

			System.out.println("4. 사번이 일치하는 사원 정보 수정");

			System.out.println("5. 사번이 일치하는 사원 정보 삭제");

			System.out.println("6. 입력 받은 부서와 일치 모든 사원 정보 조회");

			System.out.println("7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회");

			System.out.println("8. 부서별 급여 합 전체 조회");

			System.out.println("0. 프로그램 종료");
			
			
		} while(input !=0);
		
		
	}
	
}
