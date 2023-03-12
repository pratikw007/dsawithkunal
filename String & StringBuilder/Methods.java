import java.util.Arrays;

public class Methods {
    

    public static void main(String[] args) {
        String name = "Kunal Kushwaha Hello world";
        System.out.println(Arrays.toString(name.toCharArray()));// [K, u, n, a, l,  , K, u, s, h, w, a, h, a]
        System.out.println(name.toLowerCase());//kunal kushwaha
        System.out.println(name);//Kunal Kushwaha

        System.out.println(name.indexOf('a')); //3

        System.out.println("                 kuanl     ".strip()); //extra spaces remove
        System.out.println(Arrays.toString(name.split(" "))); //cut the string when we give space

    }
}
