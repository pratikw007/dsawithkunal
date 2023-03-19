public class numberExampleRecursion {
 public static void main(String[] args) {
    print(1);
 }

    static void print(int n){
        // base condition
        if (n==5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        // recursive call 
        // if you are calling a function again and again, you can treat it as
        print(n+1);
    }
   }
