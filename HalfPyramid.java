public class HalfPyramid {
    
     public static void main(String[] args) {
        int n = 4;
        for(int line = 1; line <=n; line++){//outer loop
            for(int number = 1;number <=line;number++){ //inner loop
                    System.out.print(number);
            }
            System.out.println();
        }
     }
}
 
// line = i 
//number = j
