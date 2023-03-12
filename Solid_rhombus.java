public class Solid_rhombus {

    static void Rhombus(int n){
        for (int i = 1; i <= n; i++) {

//            Spaces
            for (int j = 0;j<=(n-i);j++);
            System.out.print(" ");
        }
//        Stars
        for (int j = 1;j<=n;j++){
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
    Rhombus( 5);
    }
}

