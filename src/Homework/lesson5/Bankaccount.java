package Homework.lesson5;

public class Bankaccount {
    int id;
    String name;
    double balance;

    double popolnenieShceta(double pop)
    {
        balance += pop;
        return balance;
    }
    double sniatieSoScheta(double sni){
        balance -= sni;
        return balance;
    }

}
class BankAccountTest{
    public static void main(String[] args) {
        Bankaccount MyAccount = new Bankaccount();
        Bankaccount YourAccount = new Bankaccount();
        Bankaccount HisAccount = new Bankaccount();

        MyAccount.id = 1;
        MyAccount.name = "Zaur";
        MyAccount.balance = 12.35;
        MyAccount.popolnenieShceta(10.0);

        YourAccount.id = 2;
        YourAccount.name = "Mike";
        YourAccount.balance = 2.00;

        HisAccount.id = 3;
        HisAccount.name = "David";
        HisAccount.balance = 123.12;
        HisAccount.sniatieSoScheta(100.0);

        System.out.println(MyAccount.balance);
        System.out.println(HisAccount.balance);
    }

}
