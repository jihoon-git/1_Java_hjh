package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
//		길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
//		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후

//		짝수 번째 인덱스 값의 합을 출력하세요. ?????
//		(0 번째 인덱스는 짝수로 취급)
		
		int[] arr = new int [9];
		
		int sum=0;
		
		for(int i=0; i<arr.length;i++){
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		} 
		System.out.println("짝수 번째 인덱스 합 : ");
	}
	
	public void practice2() {
//		길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
//		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//		홀수 번째 인덱스 값의 합을 출력하세요. ???
//		(0 번째 인덱스는 짝수로 취급)
		
		int[] arr = new int [9];
		
		for(int i=arr.length; i>0;i--){
			arr[i-1]=i;
			System.out.print(arr[i-1]+" ");
		} 
		System.out.println("홀수 번째 인덱스 합 : ");
	}

	public void practice3() {
//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num= sc.nextInt();
		
		int[] arr = new int [num];
		
		for(int i=0; i<arr.length;i++){
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice4() {
//		정수 5개를 입력 받아 배열을 초기화 하고
//		검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
//		배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int [5];
		
		for(int i=0;i<arr.length; i++) {
		
		System.out.print("입력 "+i+" : ");
		int num = sc.nextInt();
		
		}
		
		System.out.print("검색할 값 : "); // 여기서부터 모름
		int search = sc.nextInt();
		
		boolean flag = true;
		
		for(int i=0;i<arr.length; i++) {
			
			if(arr[i]==search) {
				System.out.println(i+"번째 인덱스에 존재합니다.");
				flag = false;

				break;
			}
		}
		
		if(flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}

	}
	
	
	public void practice5() {
		
		
		
	}
	
	public void practice6() {
		
//		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
//		[실행 화면]
//		정수 : 5
//		배열 0번째 인덱스에 넣을 값 : 4
//		배열 1번째 인덱스에 넣을 값 : -4
//		배열 2번째 인덱스에 넣을 값 : 3
//		배열 3번째 인덱스에 넣을 값 : -3
//		배열 4번째 인덱스에 넣을 값 : 2
//		4 -4 3 -3 2 
//		총 합 : 2

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num= sc.nextInt();
		
		int[] arr = new int [num];
		
		int sum=0;
		for(int i=0;i<arr.length; i++) {
		
		System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
		int dex = sc.nextInt();
		sum++;
		
		} System.out.println(Arrays.toString(arr));
		System.out.println("총 합 : "+ sum);
	}

	public void practice7() {
//		주민등록번호를 입력 받아 char 배열에 저장한 후 출력하세요.
//		단, char 배열 저장 시 성별을 나타내는 숫자 이후부터 *로 저장하세요.
		
	}
	
	public void practice8() {
		
	}
	
	public void practice9() {
		
		int arr[]=new int [10];
	
		for(int i=0;i<arr.length;i++) {
		
		int ran = (int)(Math.random()*10+1);
		arr[i]=ran;
		
		} System.out.print("발생한 난수 : "+Arrays.toString(arr));
	}
	
	public void practice10() {
		
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
//		1~10 사이의 난수를 발생시켜 배열에 초기화 후
//		배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요

		int arr[]=new int [10];
		
		for(int i=0;i<arr.length;i++) {
		
		int ran = (int)(Math.random()*10+1);
		arr[i]=ran;
		
		} System.out.println("발생한 난수 : "+Arrays.toString(arr));
// 최대값? 최소값?
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
			
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}
	
	public void practice11() {
		
	}
	
	public void practice12() {
		
	}
	
	public void practice13() {
		
	}
	public void practice14() {
		
	}
	
	public void practice15() {
		
	}
	
	public void practice16() {
		
	}
	
	public void practice17() {
		
	}
	
	public void practice18() {
		
	}
	
	public void practice19() {
		
	}
	public void practice20() {
		
	}
	
	public void practice21() {
		
	}
	
	public void practice22() {
		
	}
	
	public void practice23() {
		
	}
	
	public void practice24() {
		
	}
	
	public void bingoGame() {
		
	}
}


