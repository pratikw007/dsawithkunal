public class Butterfly {

    static void Butter(int n){
//        1st Half
            for (int i = 1;i<=n;i++) {
//                Stars - i
                for (int j = 1; j <= 1; j++) {
                    System.out.print("*");
                }
//                Spaces - 2*(n-i)
                for (int j = 1; j <= 2 * (n - i); j++) {
                    System.out.print(" ");
                }
//                Stars  i
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            //2nd half

        for (int i = n ;i>=1;i--){
//            Stars - i
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }
//                Spaces - 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
//                Stars  i
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Butter(4);
    }
}
