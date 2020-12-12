package Lesson14;

public class Test1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++){
            if(i == 10){
                continue;
            }
            if(i%55==0){
                break;
            }
            System.out.println(i);
        }
    }
}