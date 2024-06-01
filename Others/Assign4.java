public class Assign4{
	public static void main(String []args){
		int [][]a={{1,2},{3,4,5},{6,12,32,11}};
		int [][]b=new int[a.length][];
		System.out.println("1st Array is :- ");
		System.out.print("{");
		for(int i=0;i<a.length;i++){
			System.out.print("{");
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+",");
			}
			System.out.print("}");
			System.out.println();
		}
		
		System.out.println("Now copying elements of 1st array in 2nd arrray.");
        for(int i=0,c=a.length-1;i<a.length;i++,c--){
			b[i]=new int[a[c].length];
			for(int j=0;j<a[c].length;j++){
				b[i][j]=a[c][j];
				//System.out.println(b[i][j]);
			}
		}
		System.out.println("Element in 2nd Array is :- ");
		for(int i=0;i<b.length;i++){
			System.out.print("{");
			for(int j=0;j<b[i].length;j++){
				System.out.print(b[i][j]+",");
			}
		System.out.print("}");
			System.out.println();
		}
	}
}



