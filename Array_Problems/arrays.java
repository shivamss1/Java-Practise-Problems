class arrays{
public static void main(String [] args){
  int []a={1,2,3,5,4};
  System.out.println(a[3]);
  System.out.println();
  for(int i=0;i<a.length;i++){
	  System.out.println(a[i]);
  }
  System.out.println();
  a[3]=4;
  a[4]=5;
  for(int i=0;i<a.length;i++){
	  System.out.println(a[i]);
  }
  System.out.println();
  a[1]='a';
  a[0]='@';
    for(int i=0;i<a.length;i++){
	  System.out.println(a[i]);
  } 
  a[6]=0;
  System.out.println(a[6]);
}
}