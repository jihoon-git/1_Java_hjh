package edu.kh.variable.ex1;

public class VariableExample5 {

	
	public static void main(String[] args) {
		
		// 트레이아이콘 -> 인텔 HD 그래픽 -> 그래픽 옵션
		//		-> 바로가기키 -> 사용안함
		// ctrl + alt + 방향키 위 or 아래 : 해당 줄 복사
		
		/* 출력 메서드
		 * 
		 *   System.out.print("내용")
		 *   -> ()안의 내용 출력(줄바꿈X)
		 *   
		 *   System.out.println("내용")
		 *   
		 *   -> ()안의 내용 출력(줄바꿈O) 
		 *   
		 *   System.out.printf("내용 + 패턴", 패턴에 들어갈 값)
		 * 
		 * */

		System.out.print("aaaaa");
		System.out.print("bbbbb");
		System.out.println("ccccc");
		System.out.println("ddddd");
		
		
		String name = "백동현";
		
		int age = 33;
		
		char gender = '남';
		
		double height = 175.1;
		
		boolean tf = true;
		
		
		// 백동현 님은 33세 남성, 키는 175.1cm입니다 (true)
		
		System.out.println(name+ " 님은 "+age +"세 "+ gender + "성 키는 "+height+"cm 입니다("+tf+")");
		
		System.out.printf("%s 님은 %d세 %c성, 키는 %.1fcm입니다 (%b)\n", name, age, gender, height, tf);
		// \n : 줄바꿈(개행)을 나타내는 탈출(escape)문자
		
		System.out.println("줄 바뀌었나요?");
		
		System.out.println("내가 추가한 내용");
		
		
		//주석
		System.out.println("새로운 코드");
		int aaa = 10;
		
		System.out.println("이건 자습시간에 추가한 것");
		
		
	}
}
