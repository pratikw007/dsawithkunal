public class CharecterPattern {
    public static void main(String[] args) {
        int n = 5;
        char  ch = 'A';

        // outter loop
        for(int line = 1;line <= n; line++){
            for(int chars = 1; chars <= line; chars++){
                System.out.print(ch);
                ch++;
        }
        System.out.println();
        }

    }
    
}
