package Udemy;

public class AccessModifiers {
    public static void main(String[] args) {

    }
}
class Student{
    String name;//Имеет дефолтные права дрступа и будут видны - по сути default == protected;
    public int age; //Имеет публичные права доступа и будут видны ото всюду, как вне класса так и в других пакетах - максимальный диапазон видимости!
    protected double svg;//Имеет права доступа протектед - будет виден в пределах всех классов, находящихся  в том же пакете, что и нащ! А так же в пределах всех классов наследников нашего класса!
    private String surname;//Имеет приватные права доступа - ограничивает видимость только в пределах своего класса! Что бы получить или записать какие либо данные, есть специальыне методы get & set
}
