
import java.util.Scanner;
public class GreaterNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		sc.close();
		
		if (a==b&& a==c && b==c) {
			System.out.println("a,b and c are same");
		}
		if (a>b) {
			if (a>c) {
				System.out.println("A is greater than b and c");
			}
			System.out.println("A is greater than b but less than c");
		}else if(b>c) 
		{
			if(b>a) {
				System.out.println("b is greater than a and c");
			}
			System.out.println("b is greater than c but less than a");
		}else if(c>a){
			if(c>b) {
				System.out.println("c is greater than a and b");
			}
			System.out.println("c is greater than a but less than b");
		}
	}
}
