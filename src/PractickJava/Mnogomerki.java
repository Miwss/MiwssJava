package PractickJava;

public class Mnogomerki {
    public static void main(String[] args) {
        int arr[][] = new int[2][2];
        arr[0][0] =1;
        arr[0][1] =2;
        arr[1][0] =3;
        arr[1][1] =4;

        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + "\t");
            }
        }
    }
}
