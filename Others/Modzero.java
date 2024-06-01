import java.util.Scanner;

public class Modzero{
  public static void main(String []args){
  Scanner sc=new Scanner(System.in);
  int a1=sc.nextInt();
  int result=0,digit=0;
	 System.out.println("Enter a Digit :- ");
	 int a=sc.nextInt();
	 digit=a%10;
	 result=result+digit;
	 a=a/10;
	 if(a>0){
	  digit=a%10;
	  result=result+digit;
	  a=a/10;
	
	  }
	if(a>0){
	  digit=a%10;
	  result=result+digit;
	  a=a/10;
		}
    if(a>0){
	  digit=a%10;
	  result=result+digit;
	  a=a/10;
		}
    if(a>0){
	  digit=a%10;
	  result=result+digit;
	  a=a/10;
		}		
	System.out.println("Sum is :- "+result);
  
  sc.close();
  }
}