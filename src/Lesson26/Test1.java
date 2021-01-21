package Lesson26;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("red","V4");
        Car c2 = new Car("red","V4");
        Car c3 = new Car("black","V8");
        System.out.println(c1.equals(c2));
        System.out.println(c1.toString());
    }
}

class Car{
    String color;
    String engine;
    Car(String color, String engine){
        this.color=color;
        this.engine=engine;
    }
    public boolean equals(Object obj){
        if(obj instanceof Car){
            Car c2 =(Car) obj;
            return(color.equals(c2.color) && engine.equals(c2.engine));
        }else{
            return false;
        }
    }
    public String toString(){
        return "Mashina cveta " + color + " i s motorom " + engine;
    }
}
