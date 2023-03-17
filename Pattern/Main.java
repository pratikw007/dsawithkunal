public class Main{
    public static void main(String[] args) {
        // Pattern1(4);
        // Pattern2(5);
        // Pattern3(5);
        // Pattern4(5);
        // Pattern5(5);
        Pattern7(5);
    }
    static void Pattern1(int n){
        for (int i = 1; i <= n; i++) { //for line i<=n
            // for every row , run the col
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // when oone row is printed we need to add new line 
            System.out.println();
        }
    }


    static void Pattern2(int n){
        for (int i = 1; i <= n; i++) { //for line i<=n
            // for every row , run the col
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            // when oone row is printed we need to add new line 
            System.out.println();
        }
    }



    static void Pattern3(int n){
        for (int i = 1; i <= n; i++) { //for line i<=n
            // for every row , run the col
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("*");
            }
            // when oone row is printed we need to add new line 
            System.out.println();
        }
    }


    static void Pattern4(int n){
        for (int i = 1; i <= n; i++) { //for line i<=n
            // for every row , run the col
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // when oone row is printed we need to add new line 
        }
        System.out.println();
    }


    
    static void Pattern5(int n){
        for (int i = 1; i <= 2*n; i++) { // because line = 9 ....8/2=4
         int totalColsInRow = i > n ? 2 * n -i -1 : i;
            for (int j = 1; j < totalColsInRow; j++) {
                System.out.print("* ");
            }
            // when oone row is printed we need to add new line 
            System.out.println();
        }
    }


     static void Pattern6(int n){
        for (int i = 1; i <= 2*n; i++) { // because line = 9 ....8/2=4
         int totalColsInRow = i > n ? 2 * n -i -1 : i;
         int noOfSpaces = n -totalColsInRow;
            for (int j = 1; j < totalColsInRow; j++) {
                System.out.print("* ");
            }
            // when oone row is printed we need to add new line 
            System.out.println();
        }
    }


  


    static void Pattern7(int n){
       for (int i = 1; i <= n; i++) {

        for (int spaces = 0; spaces < n-i; spaces++) {
        System.out.println(" ");
        }
        
        for (int j = i; j >=  1; j++) {
            System.out.println(j);
        }
        for (int j = 2; j <= 2; j++) {
            System.out.println(j);
        }
        
       }
    }

}