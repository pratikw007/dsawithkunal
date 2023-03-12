public class LinSearch3 {
//  for boolean VALUES 
    static boolean LinSearch3(int arr[],int key){
        if(arr.length==0){
                return false;
        }   
        for (int i = 0; i < arr.length; i++){
            // int element = arr[i];
        if(arr[i] == key){
                return true;
        }
            
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {10,34,66,75,53,75,86};
        int key = 75;
        boolean ans = LinSearch3(arr, key);
        System.out.println(ans);
    }
    
}
