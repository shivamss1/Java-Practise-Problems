public class OnetoAnother{
	public static void main(String [] args){
	int[] a={1,3,6,2,7};
	int [] n=new int[a.length];
	int j=0;
	for(int i=a.length-1;i>=0;i--){
      n[i]=a[j];
	  j++;
	}
	
	for(int i=0;i<n.length;i++){
		System.out.print(n[i]+" ");
	}
	}
}