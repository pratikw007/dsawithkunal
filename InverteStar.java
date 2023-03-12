import java.util.Scanner;

public class InverteStar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        
       while(t--> 0){

        int n = sc.nextInt();
    
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= n - line + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }   
      
    }
    }
}
