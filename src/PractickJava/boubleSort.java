package PractickJava;

public class boubleSort {
    public static void main(String[] args) {
        int nums[] = {123,321,1,3,2,14,24124124,1423412};
        int a,b,t;
        int size;
        size = 8;
        for (int i = 1; i < size; i++) {
            System.out.println("Ishodniy massiv: " + nums[i]);
        }
        for(a = 1; a < size; a++){
            for(b = size - 1; b >= a; b--){
                if(nums[b-1] > nums[b]){
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        }
        System.out.println("Otsorterovanniy massiv: " );
        for (int i = 0; i < size; i++)
        {System.out.println(" " + nums[i]);
        }
    }
}
