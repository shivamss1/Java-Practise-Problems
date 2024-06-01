import java.util.Scanner;

public class ReverseDigit{
  /*String result="";	
  int digit;	
  public void reverseno(int number){
	  digit=number%10;
	  result=result+digit;
	  number=number/10;
	  if(number>0){
		  reverseno(number);
	  }else{
		  System.out.println("Reverse no is :- "+result);
	  }
  }*/	
	
	
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
	//String result="";
    int result=0;	
    int digit;
	System.out.println("Enter a three digit number :- ");
	int number=sc.nextInt();
	
	digit=number%10;
	result=result*10+digit;
	number=number/10;
	
	digit=number%10;
	result=result*10+digit;
	number=number/10;
	
	
	digit=number%10;
	result=result*10+digit;
	number=number/10;
	
	
	digit=number%10;
	result=result*10+digit;
	number=number/10;
	
	
	digit=number%10;
	result=result*10+digit;
	number=number/10;
	
	System.out.println("Reverse no is :- "+result);
	
	//ReverseDigit r=new ReverseDigit();
	//r.reverseno(number);
  }
}