import java.util.Scanner;

public class Assign3{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int i=1,result=1;
		while(i<=3){
         result=result*no;
		 i++;
		}
		System.out.println("Cube of given "+no+" is : "+result);
	}
}