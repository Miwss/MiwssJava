package Homework.Lesson20;

public class Test {
    public static String[] abc(String[] ... array1) {//метод с варагс аргументами
        int length = 0;//счетчик для длины массива
        for(String[] array2: array1){//проходим через длину всех массивов которые есть
            length += array2.length;//счетчик принимает значение длины массивов
        }
        String[] target = new String[length];//новый массив с длинной
        int count = 0;//Счетчик
        for(String[] array2 : array1){//вывод двумерных массивов
            for(String s : array2){//вывод двумерных массивов
                target[count] = s;//присваение каждому элементу массива таргет свое значение
                count++;//увеличиваем индекс каждого элемента таргет
            }
        }
        return target;//возвращаем массив типа стринг
    }

    public static void main(String[] args) {
        {
            String[] target = abc(new String[]{"ok","privet","poka"}, new String[]{"ok","hello","bye"});//аутпут метода абс

            for(String s: args){//производим итерацию по каждому элементу аргс
                for(int i = 0; i < target.length; i++){//производит итерацию по каждому элементу таргет
                    if(s.equals(target[i])){//сравнение, если равны элементы, то элемент с таргета становится нулл
                        target[i] = null;
                    }
                }
            }
            for(String s:target){//перебор массива
                System.out.println(s + " ");//вывод массива
            }
            System.out.println();
        }
    }
}