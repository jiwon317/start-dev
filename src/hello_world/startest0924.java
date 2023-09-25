package hello_world;

public class startest0924 {
	public static void main (String[] args) {
		for (int i = 1 ; i < 5; i++) {
			if ( i % 2 == 0) {
				System.out.print("!!");
				System.out.println("!!");
				}
			else if(i % 2 == 1) {
					System.out.println("!");
				}
			}

		}
	public static void star() {
		for (int k = 1; k <= 3; k++) {
			for (int l = 1; l <= k; l++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
} 

