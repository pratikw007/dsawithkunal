import java.util.Scanner;

public class InvertedRotatedPyramid {

    public static void InvertedRotated(int n){
        // no. of lines
        for (int i = 1;i<=n;i++) {
            //for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //for itrate inner
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }

    public static void main(String[] args) {
    InvertedRotated(5);
    }
}
