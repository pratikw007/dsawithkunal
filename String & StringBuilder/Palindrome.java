import javax.swing.plaf.TreeUI;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        String str = "";
        System.out.println(isPalindrome(str));
   }    


    static boolean isPalindrome(String str){
            
        if (str == null || str.length() == 0 ) {
            // System.out.println("Element Not Found");
            return true;  
        }


         str = str.toLowerCase(); //convert the string to lower case
        for (int i = 0; i <= str.length()/2;  i++) { //n/2
            // Time Complexity : O(N)
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i); 

            if (start != end) {
                return false;
            }  
        }
        return true;
    }
 
    
}
