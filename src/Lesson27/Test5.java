package Lesson27;
import  java.io.*;

public class Test5 {

    static int abc(){
        File f = new File("test8.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
        return 5;
        }
        catch(IOException e){
            System.out.println("Hello:" + e.getMessage());
        return 6;
        }
    }
    public static void main(String[] args) {
        System.out.println(abc());

        }
    }

