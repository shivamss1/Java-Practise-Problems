import java.util.Scanner;
public class IfCode{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First no:");
		int a=sc.nextInt();
		System.out.println("Enter Second no:");
		int b=sc.nextInt();
		if(a>b){
			System.out.println(a+"is greater than"+b);
		}else{
			if(b>a){
				System.out.println(b+"is greater than"+a);
			}else{
				System.out.println(b+"is same as"+a);
			}
		}
	}
}