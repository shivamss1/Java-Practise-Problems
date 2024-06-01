
import java.util.Scanner;

public class Assign2{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int fact=1,b=a;
		if(b>0){
		while(b>=1){	
		 fact=fact*b;
		 b--;
		}
		System.out.println("Factorial of given"+a+"is :"+fact);
		}else{
			System.out.println("Invalid Number is : "+b);
		}
		
	}
}