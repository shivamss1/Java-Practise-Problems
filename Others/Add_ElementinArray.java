import java.util.Scanner;

class Add_ElementinArray{
	public  static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int [] a=new int[6];
		System.out.println("Enter a 6 no of digits to store data :- ");
		for(int i=0;i<a.length;i++){
		a[i]=sc.nextInt();	
		}
		System.out.println();
		for(int j=0;j<a.length;j++){
			System.out.print(" "+a[j]);
		}
		}
}