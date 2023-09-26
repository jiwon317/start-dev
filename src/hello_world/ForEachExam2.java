package hello_world;

public class ForEachExam2 {
	public static void main(String[] args) {
		int [] array = {1,5,3,6,7};
		
//		for( int index = 0; index < array.length; index++) {
//		int i = array[index];
//		System.out.println(i);
		for( int i : array) {
			System.out.println(i);
		}
		
	}
}
