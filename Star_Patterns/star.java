import java.util.*;

class star {

	static void pattern4(int n) {
		System.out.println();
		for (int row = 1; row <= n; row++) {
			int space = n - row;
			for (int s = 0; s < space; s++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print(" " + col);
			}
			System.out.println();
		}
	}

	static void pattern3(int n) {
		System.out.println();
		for (int row = 0; row < n; row++) {
			int space = n - row;
			for (int s = 0; s < space; s++) {
				System.out.print(" ");
			}
			for (int col = 0; col < row; col++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		// System.out.println();
	}

	static void pattern1(int n) {
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void pattern2(int n) {
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void pattern5(int n) {
		System.out.println();
		for (int row = 1; row <= 2 * n; row++) {
			int totalcolspace = row > n ? 2 * n - row : row;
			int space = n - totalcolspace;
			for (int s = 0; s < space; s++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= totalcolspace; col++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	static void pattern6(int n) {
		System.out.println();
		for (int row = 0; row < 2 * n; row++) {
			int totalcolspaces = row > n ? row - n + 1 : n - row;
			int space = totalcolspaces == 0 ? n - row : n - totalcolspaces + 1;

			for (int s = 0; s < space; s++) {
				System.out.print(" ");
			}
			for (int col = 0; col < totalcolspaces; col++) {
				System.out.print(" *");
			}
			if (row != n) {
				System.out.println();
			}
		}
	}

	static void pattern7(int n) {
		System.out.println();
		int y = 97;
		for (int row = 1; row <= n; row++) {
			int space = n - row;
			for (int s = 0; s < space; s++) {
				System.out.print(" ");
			}
			if (row % 2 != 0) {
				for (int col = 1; col <= row; col++) {
					System.out.print(" " + col);
				}
			} else {
				for (int col = 1; col <= row; col++) {
					System.out.print(" " + (char) y++);
				}
			}

		}
	}

	static void pattern8(int n) {
		System.out.println();
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				if (row == col || row+col==n-1) {
					System.out.print("*");
				}
				if (row == n/2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print as many line of pattern should have :- ");
		int n1 = sc.nextInt();

		// pattern1(n1);
		// pattern2(n1);
		// pattern3(n1);
		// pattern4(n1);
		// pattern5(n1);
		// pattern6(n1);
		// pattern7(n1);
		if(n1%2!=0){
		pattern8(n1);
		}else{
		System.out.println("Enter a odd number");	
		}

	}
}