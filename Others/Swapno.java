import java.util.Scanner;
public class Swapno{
   public static void main(String []args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number for a :- ");
   int a=sc.nextInt();  
   System.out.println("Enter a number for b :- ");
   int b=sc.nextInt();
   System.out.println("Before Swapping no are :- ");
   System.out.println("a="+a+", b= "+b);
   a=a+b;
   b=a-b;
   a=a-b;
   System.out.println("After Swapping no are :- ");
   System.out.println("a="+a+", b= "+b);
   }
}