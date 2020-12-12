package Homework.lesson6;

public class sumZERO {
    int zero(int i)
    {

        return i + 0;
    }
    int zero(int i, int j)
    {

        return i + j + 0;
    }
    int zero(int i, int j, int k)
    {

        return i + j + k + 0;
    }
    int zero(int i, int j, int k, int l)
    {

        return i + j + k + l;
    }
    int zero()
    {

        return 0;
    }
}
class sumZeroTest{
    public static void main(String[] args) {

        sumZERO sum1 = new sumZERO();
        sumZERO sum2 = new sumZERO();
        sumZERO sum3 = new sumZERO();
        sumZERO sum4 = new sumZERO();
        sumZERO sum5 = new sumZERO();

        int one = sum1.zero();
        int two = sum2.zero(1);
        int three = sum3.zero(1,2);
        int four = sum4.zero(1,2,3);
        int five = sum5.zero(1,2,3,4);

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);

    }
}
