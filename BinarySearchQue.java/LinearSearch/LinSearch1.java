import javax.lang.model.element.Element;

public class LinSearch1 {

    // public static int LinSearch1(int arr[],int key){
    //         if (arr.length==0){
    //             return -1;
    //         }
    //         for (int index = 0; index < arr.length; index++) {
    //             int element = arr[index];
    //             if(arr[index]==key){
    //                 return element;

    //             }
    //         }
    //         return -1;
    // }

    public static int LinSearch2(int arr[],int key){
        if (arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(arr[index]==key){
                return index;

            }
        }
        return Integer.MAX_VALUE;
}

    public static void main(String[] args) {
        int arr[] = {10,20,30,-1,32,26,86,46};
        // int  key = 30;
        int ans = LinSearch2(arr, -1);
        System.out.println(ans);
    }
    
}
