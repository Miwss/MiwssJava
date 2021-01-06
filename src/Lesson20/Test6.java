package Lesson20;

public class Test6 {
    public static void main(String[] args) {
        int [][] array = {{3,7,8},{4,5},{9,4,4,6,8,3}};
//        for(int i = 0; i < array.length; i++){
//            for(int j = 0; j < array[i].length; j++){
//                System.out.println(array[i][j] + " ");
//            }
//        }

        for(int[] array2:array){ //тип данных в первом случае идет массив интов, тем самым указываем массив для перебора
            for(int a: array2){ // внутри второго лупа, элементами являются уже просто инты. по этому перебор делаем по дефолту
                System.out.println(a + " ");
            }
        }
    }
}
