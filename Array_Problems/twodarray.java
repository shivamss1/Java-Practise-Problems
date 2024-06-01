public class twodarray{
	public static void main(String [] args){
		int [][]x={{1,2},{4,5}};
		System.out.println("Value of 2D X Array First is :- ");
		System.out.println("{");
		for(int i=0;i<x.length;i++){
			System.out.print("{");
			for(int j=0;j<x[i].length;j++){
				System.out.print(x[i][j]+",");
			}
			System.out.print("}");
			System.out.println();
		}
		System.out.println("}");
		int temp[][]=new int[x.length][2];
		for(int i=0,c=x.length-1;i<x.length;i++,c--){
			for(int j=0;j<x[i].length;j++){
				temp[i][j]=x[c][j];
			}
		}
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				x[i][j]=temp[i][j];
			}
		}
		System.out.println("Value of 2D X Array now is :- ");
		System.out.println("{");
		for(int i=0;i<x.length;i++){
			System.out.print("{");
			for(int j=0;j<x[i].length;j++){
				System.out.print(x[i][j]+",");
			}
			System.out.print("}");
			System.out.println();
		}
		System.out.print("}");
	}
}