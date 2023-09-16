package hello_world;

public class class_0916 {
	public static void main(String args[]) {
		int i1 = 1;
		int i2 = 3;
//		제어문 == 프로그램의 논리적 흐름을 제어하는 문장.
//		1. 조건 2. 반복
		if (i1>i2) {
			System.out.println("i1이 i2보다 큽니다.");
		} else {
			System.out.println("i1이 i2보다 작습니다");
		}
		
		int i3 = 50;
		if (i3>0 ) {
			System.out.println("i3은 양수입니다.");
		} else if (i3<0) {
			System.out.println("i3은 음수입니다");
		} else {
			System.out.println("i3은 0입니다");
		}
		char grade = 'A';
		
		int score = 81;
		if (score>=90) {
			System.out.println("A학점");
		} else if (score>=80) {
			System.out.println("B학점");
		} else if (score>=70) {
			System.out.println("c학점");
		} else { 
			System.out.println("F학점");
			
		}
		
		switch (grade) {
			case 'A': {
				System.out.println("우등생");
				break;
			}
			case 'B': {
				System.out.println("평범");
				break;
			}
			case 'C': {
				System.out.println("열등생");
				break;
			}
		}
		
		System.out.println(grade == 'B' ? "평범" : "우등생");
		System.out.println(grade == 'A' ? "우등생" : grade == 'B' ? "평범" : "열등생");
//		문제
		int b = 4;
		if (b%2==0) {
			System.out.println("b는 2의 배수입니다");
		}
		else if (b%2 != 0) {
			System.out.println("b는 2의 배수가 아닙니다");
		}
//		제어문은 논리적 흐름을 제어하는 문장.
//		제어문의 종류 : 1.조건 2.반복	
//		조건에는 if, else if, else, switch, 사망연산자가 있다. 
		
//		반복문 for, while, do-while
//		for (초기화문,조건문,증감문) {실행블럭}
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
		System.out.println();
		for (int h = 0; h < 100; h++ ) {
			System.out.print(h);
		}
		System.out.println();
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum = i + sum;
			sum += i;
		}
		System.out.println(sum);
		int total = 0;
		for (int i = 0; i <= 10; i++) {
			if (i%2 == 0) {
				total += i;
			}
		}
		System.out.println(total);
		
		int sum2 = 0;
		int i = 0;
		while (i < 10) {
			sum2 += i;
			i++;
		}
		int total2 = 0;
		int j = 2;
		while (j <= 10) {
			if (j%2 == 0) {
				total2 += j;
			}
			j++;
			
		}
		System.out.println(total2);
		
		int h = -1;
		while (h > 0) {
			System.out.println("while");
		}
		do {
			System.out.println("do-while");
		} while (h > 0);
//	반복문이 어려우니 이거를 숙지하도록.**!!	
	}
}
 