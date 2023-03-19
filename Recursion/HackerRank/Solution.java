package HackerRank;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
       double d = sc.nextFloat();
        String s = sc.nextLine();
        
        System.out.println(i+4);
        System.out.println(d+4.0);
        System.out.println(s);
    }
}



// class Solution {
//     int MissingNumber(int array[], int n) {
//         // Your Code Here

//     public static int MissingNumber(int[] arr)
//     {
//         int n=arr.length;
//         int sum1=((n)*(n+1))/2;
//         int sum2;
//         for(int i=0;i<n;i++)
//           sum2+=arr[i];
//         return sum1-sum2;
//     }
    
    
//     public static void main(String[] args)
//     {
//         int[] arr = { 1, 2, 4, 5, 6 };
//         System.out.println(MissingNumber(arr));
//     }
// }
// } 




