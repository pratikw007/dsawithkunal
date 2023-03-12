//////public class Practice {
//////
//////
//////
//////    static void Pratice1(){
//////        String[] cars = {"Volvo","BMW","Mercedize","Ford"};
//////        int[] myNum = {10,20,30};
//////        cars[0] = "Opel";
//////        System.out.println(cars[0]);
//////
//////
//////
//////    }
//////    public static void main(String[] args) {
//////          Pratice1();
//////    }
//////
//////}
////
////
//////Java Program for finding the largest element of the array
////import java.util.Scanner;
////
////public class Practice {
////    public static void Num(int arr[]) {
////        int max = arr[0];
////
////        for (int i = 0; i < arr.length; i++) {
////            if (max < arr[i]) {
////                max = arr[i];
////
////            }
////        }
////        System.out.print("Largest Element in Array: " + max);
////    }
////
////    public static void main(String args[]) {
////        int arr[] = {12, 13, 1, 10, 34, 10};
////        Num(arr);
////    }
////}
////
////
//
////{ Driver Code Starts
//// Initial Template for Java
//
//import java.io.*;
//import java.util.*;
//
//public class GFG {
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        while (T > 0) {
//            int n = sc.nextInt();
//            int arr[] = new int[n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = sc.nextInt();
//            }
//
//            int key = sc.nextInt();
//            Practice g = new Practice();
//            System.out.println(g.binarysearch(arr, n, key));
//            T--;
//        }
//    }
//
//    class Practice {
//
//        static int binarysearch(int arr[], int n, int k) {
//
//            int start = 0;
//            int end = arr.length - 1;
//            int mid = (start + end) / 2;
//            while (start <= end) {
//                if (arr[mid] < k) {
//                    start = mid + 1;
//                } else if (arr[mid] == k) {
//                    System.out.println(mid);
//                    break;
//                } else {
//                    end = mid - 1;
//                }
//                mid = (start + end) / 2;
//            }
//
//            if (start > end) {
//                return -1;
//            }
//
//        }
//    }
//}
