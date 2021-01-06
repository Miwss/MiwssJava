package Homework.Lesson19;
import java.sql.Array;
import java.util.Arrays;

public class Test {
    public static void sortirovka(int[] arr){
        for(int i =0; i<arr.length; i++)
        {
           int min = arr[i];
           int min_i = i;
           for(int j = i+1; j<arr.length;j++){
               if(arr[j] < min){
                   min = arr[j];
                   min_i = j;
               }
           }
           if(i != min_i){
               int tmp = arr[i];
               arr[i] = arr[min_i];
               arr[min_i] = tmp;
           }
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] a  = {123,231,32,1,3,2,3,4,2};
        sortirovka(a);
    }
}
