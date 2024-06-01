import java.util.Scanner;

public class Doubleadd{
public static void main(String []args){
  Scanner sc=new Scanner(System.in);
  Double a,b;
  System.out.println("Enter two Numbers :- ");
  a=sc.nextDouble();
  b=sc.nextDouble();
  Double ad,sub,mul,div,mod;
  ad=a+b;
  sub=a-b;
  mul=a*b;
  div=a/b;
  mod=a%b;
  System.out.println("Addition is :- "+ad);
  System.out.println("Substraction is :- "+sub);
  System.out.println("Multiplication is :- "+mul);
  System.out.println("Division is :- "+div);
  System.out.println("Modules is :- "+mod);
  }


} 