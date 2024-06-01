import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        if(a.length()==b.length()){
        boolean z=false;
        a.replace(" ","");
        b.replace(" ","");
        a=a.toLowerCase();
        b=b.toLowerCase();
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
        for(int t=0;t<A.length;t++){
        if(A[t]==B[t]){
            z=true;
        }else{
            z=false;
            break;
        }
        }
        return z;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}