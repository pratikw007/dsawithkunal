
/// searcing a number in the range 
// arr = { 11,23,44,53,54}
//         0   1  2  3  4
//         search the element between [1 3]
import javax.swing.event.AncestorEvent;

public class LinSearch5 {
    public static void main(String[] args) {
        int arr[] ={1,2,4,86,-66,43,-76};
        int target = 4;
        int start = 1;
        int end = 5;
        int ans = linearSearch(arr, target, start, end);
        System.out.println(ans);

    }
        public static int linearSearch(int[] arr,int target,int start, int end){
          if(arr.length == 0)
            return -1;

            for (int i = start; i <= end; i++) {
                int element = arr[i];
                if(arr[i]==target){
                    return i;
                }
                
            }
            return -1;
        }
}
