import java.util.Scanner;

public class ArraysPlusScanner {
    public static void main(String[] args) {
        Scanner list = new Scanner(System.in);
        String[] list1 = new String[10];
        for(int i = 0; i < list1.length; i++)
        {
            list1[i] = list.nextLine();
        }
        for(int j = 0; j < list1.length; j++)
        {
            System.out.println(list1[j]);
        }

//Ввод данных с клавиатуры и вывод массива на экран.
    }
}
