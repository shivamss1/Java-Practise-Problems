public class ArrayPrime{
	public static void main(String [] args){
		int[] b={21,3,5,122,23};
		for(int i=0;i<b.length;i++){
			int count=1;
			for(int j=2;j<=b[i];j++){
				if(b[i]%j==0){
					count++;
				}
				if(count>2){
					break;
				}
				
			}
			if(count==2){
					System.out.println(b[i]+" is a prime number");
				}
			
		}
	}
}