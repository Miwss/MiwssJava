package Lesson19;

import java.util.ArrayList;
import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int array1[] = {1,9,3,-8,0,5,4,1};
        for(int i = 0; i< array1.length; i++){
            System.out.print(array1[i]+ " ");
        }
        System.out.println();
        Arrays.sort(array1);
        for(int i = 0; i < array1.length; i++)
        System.out.print(array1[i] + " ");
    }
}
