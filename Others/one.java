import java.util.Scanner;

public class one{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
  int v=sc.nextInt();
  sc.close();
  if(v%4==0&&(v%100!=0||v%400==0)){
   System.out.println("It is a leap year");
  }else{
  System.out.println("It is not a leap year");
  }
}
} 