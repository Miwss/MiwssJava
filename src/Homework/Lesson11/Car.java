package Homework.Lesson11;

public class Car {
    public String color;
    public String engine;
    public int doors;

    Car(String color, String engine, int doors)
    {
        this.color = color;
        this.doors = doors;
        this.engine = engine;
    }

}
class CarTest{
    public  void changeDoors(Car car, int doorCount)
    {
        car.doors = doorCount;
    }
    public  void changeColor(Car car1, Car car2)
    {
        String car3 = car1.color;
        car1.color = car2.color;
        car2.color = car3;
    }

    public static void main(String[] args) {
        CarTest cr = new CarTest();
        Car cr1 = new Car("Red", "V6",2);
        Car cr2 = new Car("Blue", "V8", 4);

        System.out.println(cr1.doors);
        cr.changeDoors(cr1, 3);
        System.out.println(cr1.doors);
        cr.changeColor(cr1, cr2);
        System.out.println(cr1.color);
        System.out.println(cr2.color);
        System.out.println(cr);

    }


}
