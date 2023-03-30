
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1,2,4,5, 3};
        int target = 4;
    //    int n = arr.length-1;
        int ans = BinSearch(arr, 0, 0, 5);
        System.out.println(ans);
    }

    static int BinSearch(int arr[],int target,int s,int e){

        if(s>e){
            return -1;
        }

        // calculae mid 
        int m = s + (e - s)/2;

        if(target == arr[m]){
            return m;
        }
        if (target < arr[m]) {
            return BinSearch(arr, target, s, m-1);
        } 
        
            return BinSearch(arr, target, m-1, e);
    }
}
