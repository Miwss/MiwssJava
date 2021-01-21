package PractickJava;

public class MaxMin {
    public static void main(String[] args) {
        int n = 100;
        double[] array = new double[n];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = Math.random();
            System.out.println(array[i]);
        }
        double Max = array[0];
        double min = array[0];
        double avg = 0;
        for(int i = 0; i < array.length; i++){
            if(Max < array[i])
            {
                Max = array[i];
            }
            if(min > array[i]){
                min = array[i];
                avg+=array[i]/array.length;
            }
            System.out.println("Max = " + Max);
            System.out.println("Max = " + min);
            System.out.println("Max = " + avg);
        }
    }
}