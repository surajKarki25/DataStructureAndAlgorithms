/**
 * Palindrome
 */
public class Palindrome {
    public static String palindrome(int[] arr){
        int n=arr.length;
      for(int i=0;i<n/2;i++){
          if(arr[i]!=arr[n-i-1]){
            return ("not pallindrome it is !!");
          }
      }return ("pallindrome it is !!");
    }
    public static void main(String[] args) {
         int [] arr={0,1,1,2};
         String str=palindrome(arr);
         System.out.println(str);

    }
    
}
