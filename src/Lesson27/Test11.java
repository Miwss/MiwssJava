package Lesson27;
import java.io.*;


public class Test11 {
    FileInputStream fis1,fis2;
    public void abc(){
        try{
            fis1 = new FileInputStream("test9.txt");
            try{
                fis2 = new FileInputStream("test10.txt");
            }
            catch(FileNotFoundException e){
                System.out.println("File test10 ne nayden");
            }
        }
        catch(FileNotFoundException e){
            System.out.println("file test 9 ne nayden");
        }
        finally{
            System.out.println("Eto vnewniy finally block");
            try{
                fis1.close();
                fis2.close();
            }
            catch(IOException e){
                System.out.println("Naydenno isklychemie v finnaly bloke");
            }
        }
    }

    public static void main(String[] args) {
        Test11 t  = new Test11();
        t.abc();
    }
}
