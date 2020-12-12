package Lesson14;

public class Test2 {
    public void time(){
        for(int chas = 0; chas <=23; chas++)
        {
            for(int minuta = 0; minuta <= 59; minuta++){
                System.out.println(chas+ ":" + minuta);
            }
        }
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        t.time();
    }
}
