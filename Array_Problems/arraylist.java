import java.util.*;

public class arraylist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		ArrayList<ArrayList<Integer>> mainarr = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			int b = sc.nextInt();
			ArrayList<Integer> a1 = new ArrayList<>();
			for (int j = 0; j < b; j++) {
				a1.add(sc.nextInt());
			}
			mainarr.add(a1);
		}
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			try {
				ArrayList<Integer> b1 = new ArrayList<>();
				for (int k = 0; k < 1; k++) {
					b1.add(sc.nextInt());
				}
				int a11 = b1.get(0);
				int a12 = b1.get(1);
				System.out.println(mainarr.get(a11).get(a12));
			} catch (Exception e) {
				System.out.println("ERROR!");
			}
		}
	}
}
