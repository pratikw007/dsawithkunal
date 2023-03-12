public class LinSearch4 {
    // Liner search for treees

    static boolean search(String str,char key){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==key){
                    return true;
            }
            
        }
            return true;
    }
    public static void main(String[] args) {
        String str = "Prateek";
        char key = 'a';
        boolean ans = search(str,key);
        System.out.println(ans);
        // System.out.println(Arrays.toString(name.toCharArray()));
    }
}
