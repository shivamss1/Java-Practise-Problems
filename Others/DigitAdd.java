import java.util.Scanner;

public class DigitAdd{
	//int result=0,digit=0;
	/*public void sum(int number){
		digit=a%10;
	 result=result+digit;
	 a=a/10;
	 if(a>0){
	  digit=a%10;
	  result=result+digit;
	  a=a/10;
	if(){sum(number);}else{
		System.out.println("Sum :- "+result);
	}
	  }
	}*/
	
 public static void main(String []args){
	 Scanner sc=new Scanner(System.in);
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
	//sum(number);
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

	// DigitAdd d=new DigitAdd();
	 //d.sum(a);
 }
}