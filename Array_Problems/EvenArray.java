public class EvenArray{
	public static void main(String [] args){
		int [] a={2,44,3,15,78};
		for(int g=0;g<a.length;g++){
			System.out.println(a[g]);
		}
		System.out.println("The Even no from given Array is :- ");
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				System.out.println(a[i]+" is a even no from given array.");
			}else{
				System.out.println(a[i]+" is not a even no from given array.");
			}
		}
	}
}