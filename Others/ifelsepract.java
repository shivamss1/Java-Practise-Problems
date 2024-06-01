import java.util.Scanner;

//interview question for logic
public class ifelsepract{
	
	public static void main(String []args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your choice number:");
		int no=sc.nextInt();
		 if(no>0){
		  if(no%3==0 && no%5==0){
			System.out.println("Haha...Number is divisble by both 3 and 5");
		  }else if(no%3==0){
			System.out.println("Hi..Number is divisble by 3 ");
		  }else if(no%5==0){
			System.out.println("Hello Number is divisble by 5");
		  }else{
			System.out.println("Number is nor divisble by 3 or 5");
		  }
	    }else{
		System.out.println("Invalid number");
	     }
	}
}