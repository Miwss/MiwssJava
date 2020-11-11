public class ClassesAndObjects {
    public static void main(String[] args) {
        Person human = new Person();
        human.setName("");
        human.setAge(-1);
       // human.speak();
        System.out.println(human.getAge() + " " + human.getName());

        //System.out.println(year1);
        // System.out.println(human.age + " " + human.name);
    }
}

class Person{
    private String name;
    private int age;

    public void setName(String name) {
       if (name.isEmpty()){
            System.out.println("Pustoe Imya");
        }
        else{
            this.name = name;
        }
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
       if(age  < 0){
           System.out.println("Oshibochka");
       }else {
           this.age = age;
       }
    }
    public int getAge()
    {
        return age;
    }


    int calculate(){
        int years = 65 - age;
        //System.out.println("Ostalos do pensii " + years);
        return years;
    }

    void speak() { //круглые скобки передача параметров
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ", Мне " + age);
        }
    }
    void sayHello(){
        System.out.println("Hello, world");
        System.out.println("Hello, world " + name);
    }
}
