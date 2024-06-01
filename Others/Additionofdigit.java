import java.util.Scanner;

public class Additionofdigit
{
  public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter A Digit :- ");
	  int a=sc.nextInt();
	  /*if(a>=10){
		  int res=a/10+a%10;
		  System.out.println("Addition to two digit is :"+res);
	  }else{
		  System.out.println("Enter A Digit equal to 10 or bigger");
	  }*/ //it is for two digit no
	  
	  /*int r=0;
	  while(a>0){
		  int digit=a%10;
		  r=r+digit;
		  a=a/10;
	  }
	  System.out.println("Addition of your digit is: "+r);*/  //this logic is for three or any digit no addition 
	  
	  int r=0,j=0;
	  while(a>0){
		  int digit=a%10;
		  r=r+digit;
		  a=a/10;
	  }
	  //System.out.println(r);
	  
		if(r>=10){ 
	   while(r>=10 && r<=99){
		  j=(r%10)+(r/10);
          r=j;		  
	   }
	  System.out.println("Addition in single digit is : "+j);
		}else{
			System.out.println("Addition in single digit is :"+r);
  }
}

   
   
