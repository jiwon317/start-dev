package hello_world;

public class ArrayWithFor {
	public int[] fill100() {
		int[] array = new int[100];
		for(int i = 0; i < array.length; i++) {
			array[i] = i+1;
		}
		return array;
	}
	
	
	public static void main(String[] args) {
		ArrayWithFor exam = new ArrayWithFor();
		int[] arr2 = exam.fill100();
		int errCount = 0;
		for (int i = 0; i < 100; i++) {
			if (arr2[i] != i + 1) {
				System.out.println("array[" + i + "]의 값이 틀립니다.");
				errCount++;
				
			}
		}
		if(errCount == 0)
			System.out.println("정답입니다.");
		
	}
}
