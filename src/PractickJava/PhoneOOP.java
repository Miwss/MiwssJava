package PractickJava;

import java.util.ArrayList;

public class PhoneOOP {
    private String Number;
    private String model;
    private double weigth;

    PhoneOOP(String Number, String model, double weigth){
        this(Number, model);
        this.weigth = weigth;
    }

    PhoneOOP(String Number, String model){
        this.Number = Number;
        this.model = model;

    }
    PhoneOOP(){}
    public void receiveCall(String name){
        System.out.println("Звонит: " + name);
    }
    public void receiveCall(String name, String Number){
        System.out.println("Имя звонящего: " +name+ " Номер телефона: " +Number);
    }
    public void getNumber(PhoneOOP s){
        String number = s.Number;
        System.out.println("Номер звонящего: " +Number);
    }
    public void sendMessage(String ... s){
        for(int i = 0; i<s.length; i++)
            System.out.println("Номера телефонов: " + s[i]);
    }
    public static void main(String[] args) {
        PhoneOOP ph1 = new PhoneOOP("0939977732", "iPhone", 120.0);
        PhoneOOP ph2 = new PhoneOOP("0939789723", "Xiaomi", 126.0);
        PhoneOOP ph3 = new PhoneOOP("0501235325", "Pixel", 90.0);
        System.out.println("Номер телефона: " +ph1.Number+ " Модель телефона: " +ph1.model+" Вес: " +ph1.weigth);
        System.out.println("Номер телефона: " +ph2.Number+ " Модель телефона: " +ph2.model+" Вес: " +ph2.weigth);
        System.out.println("Номер телефона: " +ph3.Number+ " Модель телефона: " +ph3.model+" Вес: " +ph3.weigth);
        ph1.receiveCall("Misha");
        ph1.getNumber(ph1);
        ph2.receiveCall("Artem");
        ph2.getNumber(ph2);
        ph3.receiveCall("Sasha");
        ph3.getNumber(ph3);


        ph1.receiveCall("Kolya", "123456789");
        ph1.sendMessage("123456789", "987654321", "12321412");
    }
}
