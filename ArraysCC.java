import java.lang.reflect.Array;

public class ArraysCC {
    //    Creating an Array
    //     int marks[]= new int[50];  
    //     int numbers[]= {4,5,6};
    //     int moreNumbers[] ={2,4,5};
    //     String fruits[]={"apple","Mango","banana"}; 

    //updation of marks by call by refrance 
    public static void update(int marks[]){
        for(int i = 0;i<marks.length;i++){
        marks[i] = marks[i] + 1;
        }
    }
     public static void main(String[] args) {
        int marks[]={97,98,99};
        update(marks);

        //print our marks 
        for(int i = 0 ; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
            System.out.println();
        }
}

