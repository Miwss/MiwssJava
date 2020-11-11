public class konstryktor {
    public static void main(String[] args) {
        Human human1 = new Human( 321);
        Human human2 = new Human();
    }
}
class Human{

    private String name;
    private int age;

    public Human(){
        System.out.println("Привет из первого конструктора!");
    }
    public Human(String name){
        this.name = name;
        System.out.println("Второй конструктор только с именем!");
    }
    public Human(int age){
        this.age = age;
        System.out.println("Третий конструктор только с возрастом!");
    }
    public Human(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Четвертый конструктор со всем!");
    }


    //public void setName(String name){this.name = name;}

    //public void setAge(int age){this.age = age;}
}
