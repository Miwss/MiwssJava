package Lesson27;
import java.io.*;

public class Test7 {
    static void abc()throws IOException{
        try{
            File f = new File("test10.txt");
            FileInputStream fis = new FileInputStream(f);
            }
        catch (IOException e){
            System.out.println("Exception poyman");
            throw e;
        } finally{
            System.out.println("Eto finally block");
        }
    }

    public static void main(String[] args) {
        System.out.println();
    }

}
