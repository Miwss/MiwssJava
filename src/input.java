import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //Класс сканер с пакета джава утил.
        System.out.println("Введите ваш возраст: ");
        int string = s.nextInt(); //Создаем новій обьект класса стринг и передаем ему то, что будет введено с клавиатуры. Через метод nextLine();
        //nextLine(); - Метод у класса Scanner, который читает одну строчку чего то!
        //nextInt(); - ввод числа
        int i;
        i = 65 - string;
        System.out.println("Вам осталось лет до пенсии: " + i);
    }
}
