import java.util.*;
public class RemoveDuplicatesfromSortedArray {
    // https://youtu.be/JHzdGAh_6mk
    public static void main(String[] args) {
        Scanner sc = new Scanner(System);
        int nums = sc.nextInt();
        // removeDuplicates(nums);

    }

   
        public int removeDuplicates(int[] nums) {
            int j = 0;
            for(int i = 0;i<nums.length;i++){
                if(nums[j]!=nums[i]){
                    j++;
                nums[j]=nums[i];
                }
            }
            return j+1;
        }
    }

