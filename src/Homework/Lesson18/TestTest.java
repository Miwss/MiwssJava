package Homework.Lesson18;

public class TestTest {
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2)
    {
        boolean result = true;
        if(sb1.length() == sb2.length())
        {
            for(int i = 0; i < sb1.length(); i++){
                if(sb1.charAt(i) != sb2.charAt(i))
                {
                    result = false;
                    break;
                }
            }
        }else{
            result = false;
        }
        return result;
    }
}
class Test2{
    public static void main(String[] args) {
        StringBuilder sb3 = new StringBuilder("hello");
        StringBuilder sb4 = new StringBuilder("hello");
        StringBuilder sb5 = new StringBuilder("Hello");
        boolean a = TestTest.ravenstvo(sb3, sb4);
        System.out.println(a);
        System.out.println(TestTest.ravenstvo(sb4, sb5));
        System.out.println(TestTest.ravenstvo(new StringBuilder(" "), new StringBuilder(" ")));
        System.out.println(TestTest.ravenstvo(new StringBuilder(), new StringBuilder()));


    }

}
