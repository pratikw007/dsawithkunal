public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {10,50,2,58,65,23,96,8};
        int key = 23;
        int ans = LinSearch(arr, key);
        System.out.println(ans);
    }

            // searching the array
    static int LinSearch(int arr[],int key){
        if(arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if(element ==key){
                return index;
            }
        }
        return -1;
    }


  
}
