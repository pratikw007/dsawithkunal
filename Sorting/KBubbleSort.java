import java.util.Arrays;

public class KBubbleSort {
    
        public static void Bubble(int[] arr){
                boolean swapped;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 1; j < arr.length-i; j++) {
                swapped = false;
                    if (arr[j]<arr[j-1]) {
                        // swap
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;  
                        swapped = true;              
                    }
                }

                // if(!swapped){
                //     break;
                // }
                
            }

        } 

    public static void main(String[] args) {
        int arr[] = { 5,4,1,3,2};
        Bubble(arr);
        System.out.print(Arrays.toString(arr));

    }
    
}
