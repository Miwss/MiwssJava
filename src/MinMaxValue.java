public class MinMaxValue {
    public static void main(String[] args) {
        int[] value = {12312, 32, 3132, 51, 12312, 125, 521, 231, 31, 10};
//        int min = value[0];
//        for(int i = 0; i < value.length;i++)///////////
//        {                                   /////////// Min Value
//            if(value[i] < min)              ///////////
//                min = value[i];             ///////////
//        }
//        System.out.println("Min is: " + min);
//    }
//        int max = value[0];
//        for (int i = 0; i < value.length; i++) {
//            if (value[i] > max)
//                max = value[i];                     ///////// Max Value
//
//        }
//        System.out.println("Max is: " + max);
//    }
        int sum = 0;
        for(int num:value)
        {
            sum = sum + num;   //////////Сумма элементов уже инициализированного массива
        }
        System.out.println(sum);
    }
}
