package Lesson6;

public class MethodOverloading2 {
    int sum(int i, int j)
    {
        System.out.println(i + j);
        return i + j;
    }
    String sum(String i, String j)
    {
        System.out.println(i + j);
        return i + j;
    }
}

class MethodOverloading2Test{
    public static void main(String[] args) {
        MethodOverloading2 mo = new MethodOverloading2();
        mo.sum(1,2);
        mo.sum("Hello", " world");
    }
}
