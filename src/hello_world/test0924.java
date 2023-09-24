package hello_world;

public class test0924 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if (i == 1 ) {
				continue;
			}
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + (i * j));
// i = 1, j가 1에서 9까지 반복, j 루프 탈출, i 증가
// i = 2, j <=9, j break, i++
// i = 3, j <=9, j break, i++

			}
		}
			
	}
}
