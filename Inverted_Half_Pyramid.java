import java.util.logging.Handler;

public class Inverted_Half_Pyramid {

   public static void Inverted_Half_Pyramid(int n){
//            outer loop
       for (int i = 1; i <=n ; i++) {
            for(int j = 1; j<=n-i+1;j++){
                System.out.print(j+" ");
            }
           System.out.println();
       }

   }

    public static void main(String[] args) {
        Inverted_Half_Pyramid(5);
    }
}
