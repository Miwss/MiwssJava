package Homework.Lesson13;

public class Month {

    public static void monthName(int Monthname){
        switch(Monthname){
            case 1:
                System.out.println("Yanvar: 31 den`");
                break;
            case 2:
                System.out.println("Fevral: 28 dne`");
                break;
            case 3:
                System.out.println("Mart: 31 den`");
                break;
            case 4:
                System.out.println("Aprel: 30 dne`");
                break;
            case 5:
                System.out.println("May: 31 den`");
                break;
            case 6:
                System.out.println("Iyn`: 30 dne`");
                break;
            case 7:
                System.out.println("Iyl`: 31 den`");
                break;
            case 8:
                System.out.println("August: 31 dne`");
                break;
            case 9:
                System.out.println("Sentyabr`: 30 den`");
                break;
            case 10:
                System.out.println("Oktyabr`: 31 dne`");
                break;
            case 11:
                System.out.println("Noyabr`: 30 dne`");
                break;
            case 12:
                System.out.println("Dekabr`: 31 dne`");
                break;
            default:
                System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        monthName(3);
        monthName(-123);
    }
}
