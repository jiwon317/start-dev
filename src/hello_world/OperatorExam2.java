package hello_world;

public class OperatorExam2 {
	public void calculate(int a, int b) {
	
		boolean c = a > b;
		boolean d = a == b;
		boolean e = a != b;
		
		System.out.println(a+"은(는) "+b+"보다 큽니까? "+ c);
		System.out.println(a+"은(는) "+b+"와(과) 같습니까? "+ d);
		System.out.println(a+"은(는) "+b+"와(과) 다릅니까? "+ e);
}

	public static void main(String[]args) {
		// 0~10 사이 값을 랜덤하게 변수 a와 b에 넣어줍니다.
		int a = (int)(Math.random()*10);
		int b = (int)(Math.random()*10);
		new OperatorExam2().calculate(a, b);
		System.out.println(Math.random());
		System.out.println(Math.random()*10);
		System.out.println((int)Math.random()*10);
		
	}		
}		
// Math.random()은 0.0이상에서 1.0미만의 랜덤한 double형의실숫값을 반환
// Math.random()*10은 0.0에서 10.0미만의랜던한 값을 반환
