package BinarySearch.LEETCODE;
// 34. Find First and Last Position of Element in Sorted Array
public class Q_34 {
    public static void main(String[] args) {
        
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans; 
    }

    
    // this function just return the index value of target 
    int search(int[] nums,int target,boolean firstStartIndex){
       
        //check for first occurance if target first
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
        //find th middle element
        // int mid=(start+end)/2; //might be possible that (start + end)
        // exceeds the range of integers java

        int mid = start + (start + end)/2;
        if(target < nums[mid]){ 
            end = mid -1;
        }else if(target > nums[mid]){
            start = mid + 1;
        }else{
           //potential ans found
           ans = mid;
           if(findStartIndex){
              end = mid - 1;
           }else{
            start = mid + 1;
           }
        }
        }
        return ans;
    }
}
// 01.26.10

