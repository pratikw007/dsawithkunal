import java.util.*;
public class JavaBasics {
    public static void HelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    // public static int HelloWorld(){
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    //     return 3;
    // }
    public static int CalculateSum(int num1, int num2){ //parameters or formal parameters
       int sum = num1 + num2;
    //    System.out.println(sum);
       return sum;
    }

    public static void main(String args[]){
            // HelloWorld();  
            Scanner sc = new Scanner(System.in);
             int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = CalculateSum(a, b);//arguments a,b or actual parameters
            //function calling ke time kam aata hai 
            System.out.println("sum is : " + sum);
           
    }
    
}
