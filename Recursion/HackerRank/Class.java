package HackerRank;


class Solution {
   static int MissingNumber(int array[], int n) {
            int sum = 0;
        for(int i = 0;i<=array.length;i++){
            sum += array[i];
            System.out.println(sum);
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[] ={1,2,3,5};
        int n = 4;
        MissingNumber(array,n);
    }
}
