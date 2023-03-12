
public class FloorOfNumber {

    // return the index of smalled no. >= target 

    // what is the target is greater than the greatest number in the array. 
        static int CeilingOfNumber(int[] arr,int target){
            int start = 0;
            int end = arr.length - 1; //array ki length se minus
    
            while (start <= end) {
                
                int mid = start + (end -start) / 2;
    
                if(target < arr[mid]){
                    end = mid -1;
                }else if(target > arr[mid]){
                    start = mid + 1;
                } else {
                    //ans found 
                    return mid;
                }
            }
            return start;
        }
    
        public static void main(String[] args) {

            
            int[] arr = {2,3,5,9,14,16,18};
            int target = 15;
            int ans = CeilingOfNumber(arr, target);
            System.out.println(ans);
        }
    }
    

// 47.37 end 