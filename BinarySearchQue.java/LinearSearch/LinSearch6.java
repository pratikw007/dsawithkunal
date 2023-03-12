// min and maximum array
// arr[] = {18,12,-7,4,15,29};
//          0   1  2  3 4  5
// search minumum and maximum number 


public class LinSearch6 {
        public static void main(String[] args) {
            int arr[] = {18,12,-7,4,15,29};
            System.out.println(min(arr)); 
        }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>ans){
                   ans = arr[i];
            }         
        }
        return ans;
    }
}
