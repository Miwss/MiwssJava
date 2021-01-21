package Lesson27;

public class Test4 {
    public static void main(String[] args) {
        int [] array = {4,8,1};
        System.out.println("U nas est massiv");
        try {
            System.out.println(array[5]);
            System.out.println("Vsem xorowego dnya!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Bil poyman exception");
        }
        System.out.println("Danniy kod uje ne imeet otnosheniya k isklycheniyam");
    }
}
