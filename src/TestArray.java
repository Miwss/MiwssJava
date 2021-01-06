import java.rmi.MarshalException;
import java.util.Random;

public class TestArray {
    public static void main(String[] args) {
//        int a=0;
//        for(int i = 2; i<=20;i++)
//        {
//            if(i%2==0)
//            {
//                a++;
//            }
//        }
//        int[] arr = new int[a];
//        {
//            for(int i = 2, b =0; i<=20;i++)
//            {
//                if(i%2==0){
//                    arr[b]=i;
//                    System.out.print(arr[b]+" ");
//                    b++;
//                }
//            }
//            System.out.println(" ");
//            for(int i = 0; i< arr.length;i++){
//                System.out.println(arr[i]);
//            }
//        }

//        int a =0;
//        for(int i = 1; i<=99;i++)
//        {
//            if(i%2 !=0){
//                a++;
//            }
//        }
//        int[] arr = new int[a];
//        {
//            for(int i = 1, b = 0; i <=99; i++){
//                if(i%2 != 0)
//                {
//                    arr[b] = i;
//                    System.out.print(arr[b] + " ");
//                    b++;
//                }
//            }
//            System.out.println(" ");
//            for(int i = arr.length-1; i > 0; i--){
//                System.out.print(arr[i]+" ");
//            }
//        }
//        Random r = new Random();
//        int count =0;
//        int [] arr= new int[11];
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = r.nextInt(9);
//            System.out.println(arr[i]);
//            if(arr[i] % 2 ==0){
//                count++;
//            }
//        }
//        System.out.println("Количество четных элементов: " + count);
//        Random r = new Random();
//        int[] arr = new int[11];
//        for(int i = 0; i < arr.length; i++)
//        {
//            arr[i] = r.nextInt(10);
//            System.out.print(arr[i]+ " ");
//        }
//        int[] arr = new int[8];
//        for (int i = 0; i < arr.length; i++)
//        {
//            arr[i] = (int)(Math.random()*9+1);
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println("");
//        for(int i =0; i < arr.length; i++){
//            if(arr[i] %2 != 0)
//                arr[i] = 0;
//                System.out.print(arr[i]+ " ");
        //}
        Random r = new Random();
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int a = 0;
        int b = 0;
        for(int i = 0; i<arr1.length;i++){
            arr1[i] = (int)(Math.random()*6);
            System.out.print(arr1[i]+ " ");
        }
        System.out.println("");
        for(int i = 0; i< arr2.length; i++) {
            arr2[i] = (int)(Math.random()*6);
            System.out.print(arr2[i] + " ");
        }
        for(int i = 0; i<arr1.length; i++){
            a +=(int)arr1[i]/arr1.length;
        }
        System.out.println("");
        for(int i = 0; i<arr2.length; i++) {
            b += (int) arr2[i] / arr2.length;
        }
        if(a == b){
            System.out.println("Среднее арифметическое равно");
        }
        else if(a > b){
            System.out.println("Pervoe bolwe ili ravno");
        }
        else if(a < b){
            System.out.println("Vtoroe bolwe ili ravno");
        }
    }
}
