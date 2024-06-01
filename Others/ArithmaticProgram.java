

import java.util.Scanner;
public class ArithmaticProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  int a =sc.nextInt();
  int b=sc.nextInt();
  
  int Add=a+b;
  int Sub=a-b;
  int mult=a*b;
  int Div=a/b;
  int Modulus=a%b;
  
  sc.close();
  
  System.out.println("Addition is :- "+Add);
  System.out.println("Substraction is :- "+Sub);
  System.out.println("Multiplication is :- "+mult);
  System.out.println("Division is :- "+Div);
  System.out.println("Modulus is :- "+Modulus);
	}

}
