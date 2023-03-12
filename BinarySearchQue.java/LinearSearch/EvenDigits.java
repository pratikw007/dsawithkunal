import javax.swing.text.html.StyleSheet;
import java.util.*;
// leetcode queNO  1295: Find Numbers with Even Number of Digits
public class EvenDigits {
        public static void main(String[] args) {
            int[] nums = {12,345,2,6,7896};
            System.out.println(findNumber(nums));
            // System.out.println(54637);
        }

        static int findNumber(int[] nums){
            int count = 0;
            for(int num : nums){
                if(even(num)){
                    count++;
                }
            }
            return count;
        }
        static boolean even(int num){
            int numberOfDigits = digits(num);

            if( numberOfDigits % 2 == 0){
                return true;
            }
            return false;  
        }
        static int digits(int num){
            int count = 0;

            while(num>0){
                count++;
                num = num / 10;

            }
            return count;
        }

}
