
 // fibonacci number using recursion.
public class Fibo {
    static int fibo(int n) {
        // base condition
        if (n < 2) {
            return n;
        }
// this is not tail recucrrsion because fibo(n-1) return some value and 
// fibo(n-2) return some value 
        return fibo(n - 1) + fibo(n - 2);
    }
    public static void main(String[] args) {
        // int n = 5;
        int ans = fibo(5);
        System.out.println(ans);
    }
}
