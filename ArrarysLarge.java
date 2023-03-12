import java.util.*;
public class ArrarysLarge {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;// -infinite  - most negative value
        int smallest= Integer.MAX_VALUE; //+ infinite
        for(int i = 0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];//update
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest Value is :" + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5};
        System.out.println("Largest value is : " + getLargest(numbers));
    }
}
