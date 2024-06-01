public class swap{
	
	public static void main(String []args){
		int a=9,b=11;
		//1st type
		int temp;
		System.out.println("Before Swapping");
		System.out.println("a="+a+"\t b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping");
		System.out.println("a="+a+"\t b="+b);
		
		//2nd type
		/*System.out.println("Before Swapping");
		System.out.println("a="+a+"\t b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		System.out.println("a="+a+"\t b="+b);*/
		
		//3rd type
		/*System.out.println("Before Swapping");
		System.out.println("a="+a+"\t b="+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping");
		System.out.println("a="+a+"\t b="+b);*/
		
		//4th type
		/*System.out.println("Before Swapping");
		System.out.println("a="+a+"\t b="+b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After Swapping");
		System.out.println("a="+a+"\t b="+b);*/
		
		//5th type
		/*System.out.println("Before Swapping");
		System.out.println("a="+a+"\t b="+b);
		a=(a+b)-(b=a);
		System.out.println("After Swapping");
		System.out.println("a="+a+"\t b="+b);*/
	}
}