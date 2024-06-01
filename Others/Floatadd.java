import java.util.Scanner;

public class Floatadd{
public static void main(String []args){
  Scanner sc=new Scanner(System.in);
  Float a,b;
  System.out.println("Enter two Numbers :- ");
  a=sc.nextFloat();
  b=sc.nextFloat();
  Float ad,sub,mul,div,mod;
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