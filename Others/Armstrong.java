import java.util.Scanner;

public class Armstrong{
  public static void main(String []args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a three digit number :- ");
   int a=sc.nextInt();
   
   int digit,cube=0,original;
   
   original=a;
   
   digit=a%10;
   cube=cube+digit*digit*digit;
   a=a/10;
   
   digit=a%10;
   cube=cube+digit*digit*digit;
   a=a/10;
   
   digit=a%10;
   cube=cube+digit*digit*digit;
   a=a/10;
   
   if(cube==original){
   System.out.println("Number is a Armstrong number.");
   }else{
   System.out.println("Number is not a Armstrong number.");
   }
  }
}