import java.util.*;

class Solution{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		boolean z=false;
		a=a.toLowerCase();
		b=b.toLowerCase();
		sc.close();
		char[] A=new char[a.length()];
		char[] B=new char[b.length()];
		for(int i=0;i<a.length();i++){
			A[i]=a.charAt(i);
		}
		for(int j=0;j<b.length();j++){
			B[j]=b.charAt(j);
		}
		for(int q=0;q<A.length;q++){
			for(int w=q+1;w<A.length;w++){
				if(A[q]>A[w]){
					char c=A[q];
					A[q]=A[w];
					A[w]=c;
				}
			}
		}
		for(int e=0;e<B.length;e++){
			for(int r=e+1;r<B.length;r++){
				if(B[e]>B[r]){
					char c=B[e];
					B[e]=B[r];
					B[r]=c;
				}
			}
		}
		for(int k=0;k<A.length;k++){
			System.out.print(A[k]);
		}
		System.out.println();
		for(int h=0;h<A.length;h++){
			System.out.print(B[h]);
		}
		System.out.println();
		for(int t=0;t<A.length;t++){
		if(A[t]==B[t]){
			z=true;
		}else{
			z=false;
		}
		}
		if(z){
			System.out.print("Anagram");
		}else{
			System.out.print("Not Anagram");
		}

	}
}