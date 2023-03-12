import java.util.*; 
public class Q774 {
              //In Assending order every single element is > = the privious element
              public static void main(String[] args) {
                int letters = ["c","f","j"];
                int target = 'a';
                   int ans = nextGreatestLetter(letters, target);
                   System.out.println(ans);
              }



              public char nextGreatestLetter(char[] letters, char target) { 
                    int start = 0;
                      int end = letters.length-1;
    
                      while(start<=end){
                      int mid = start + (start + end)/2;          

                      if(target < letters[mid]){ // the element should be L.H.S
                      end = mid -1;
                      }else{
                          // So End will not Change ut Start  will change
                          start = mid + 1;
                      }
                      }
                      return letters[start% letters.length];
              }
              }
          