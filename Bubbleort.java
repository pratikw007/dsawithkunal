import java.util.Arrays;

public class Bubbleort {
    public static void main(String[] args) {
         int arr[] ={5,3,2,1,4,9,4};
         bubble(arr);
         System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        // run the steps n-1 times

        for (int i = 0; i < arr.length; i++) {
            // for each step, max item will come at the last respective index
            for(int j = 1;j <arr.length - i;j++){
                // swap if the itemm is smaller than the previous item

                if(arr[j]< arr[j-1]){
                    // swap 
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
