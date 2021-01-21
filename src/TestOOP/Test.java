package TestOOP;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        Sport s1 = new football();
        Sport s2 = new Vollayball();
        Sport s3 = new gandball();
        zamena s4= new gandball();
        s1.showInfo();
        s2.showInfo();
        s3.showInfo();
        s4.zamenaIgroka();

    }

}

abstract class Sport{
    String nazvanieKomandi;
    int kolichestvoIgrokov;
    abstract void showInfo();

}
class football extends Sport {
    String nazvanieKomandi = "Navi";
    int kolichestvoIgrokov = 5;
    void showInfo(){
        System.out.println("Comand: " + nazvanieKomandi + "\n" + "Igrokov: " + kolichestvoIgrokov  + "\n");
    }
}
class Vollayball extends Sport {
    String nazvanieKomandi = "Gambit";
    int kolichestvoIgrokov = 5;
    void showInfo(){
        System.out.println("Comand: " + nazvanieKomandi + "\n" + "Igrokov: " + kolichestvoIgrokov + "\n");
    }

}
class gandball extends Sport implements zamena{
    String nazvanieKomandi = "VirtusPro";
    int kolichestvoIgrokov = 5;
    void showInfo(){
        System.out.println("Comand: " + nazvanieKomandi + "\n" + "Igrokov: " + kolichestvoIgrokov + "\n" );
    }
    public void zamenaIgroka(){
        System.out.println("VP zamenili 1 igroka");
    }
}

interface zamena{
    void zamenaIgroka();
}