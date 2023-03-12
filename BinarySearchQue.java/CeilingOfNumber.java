public class CeilingOfNumber {

    static int CeilingOfNumber(int[] letters,int target){
        int start = 0;
        int end = letters.length - 1; //array ki length se minus

        while (start <= end) {
            
            int mid = start + (end -start) / 2;

            if(target < letters[mid]){
                end = mid -1;
            }else if(target > letters[mid]){
                start = mid + 1;
            } else {
                //ans found 
                return mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] letters = {'c','f','j'};
        int target ='a';
        int ans = CeilingOfNumber(letters, target);
        System.out.println(ans);
    }
}


// 01.03