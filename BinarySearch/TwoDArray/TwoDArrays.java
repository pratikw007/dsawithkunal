package TwoDArray;

import java.util.Scanner;

public class TwoDArrays {

    public static void main(String[] args) {
      int arr[][] = new int[3][3];
      int n = arr.length;//no. of rrows
      int m = arr[0].length; //no. of cols 
      Scanner sc = new Scanner(System.in);
       for (int i = 0; i < n; i++) {
        for(int j = 0;j<m; j++){
        
            arr[i][j] = sc.nextInt();

        }
        
       }
    }

}
