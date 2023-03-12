import java.util.Scanner;

public class Pranay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //     int n;
    //     n = sc.nextInt();
    //     for(int i=0; i<2; i++){
    //         int a = sc.nextInt();
            
    //     }
    // }


   int a = sc.nextInt();


   while(a-->0){
    int n = sc.nextInt();
    int b = 1;
    for (int i = 1; i <= n; i++) {
        for(int j = 1;j<=i;j++){
            System.out.print(b+" ");
            b += 1;
        }
        System.out.println();
        
    }
   }
    
}

}