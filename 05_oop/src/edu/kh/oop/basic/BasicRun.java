package edu.kh.oop.basic;

public class BasicRun {

	public static void main(String[] args) {
		
		HJH 백동현 = new HJH();
		// heap 영역에 HJH 클래스에 정의된 내용을 이용하여
		// HJH 객체 생성(할당)
		
		// 객체가 가지고 있는 속성 출력
		System.out.println("이름 : " + 백동현.name);
		System.out.println("나이 : " + 백동현.age);
		System.out.println("생년월일 : " + 백동현.birthday);
		
//		System.out.println("비밀번호 : " + 백동현.password);

		// 비밀번호를 볼 수 있는 기능을 호출 == 간접 접근 방법
		백동현.showPassword();
		
		// 기능 수행
		백동현.eat();
		백동현.study();
		백동현.plus(50, 100);
		
	}
	
}
