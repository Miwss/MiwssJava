import java.util.Scanner;
public class ProgramSwtichElseIf {
    public static void main(String[] args) {
        System.out.println("Выберите инструкцию:");
        System.out.println("1.Конструкция(if-else)");
        System.out.println("2.Коснтрукция(switch)");
        System.out.println("Выберите: ");
        Scanner line = new Scanner(System.in);
        String l = line.nextLine();
        switch(l)
        {
            case "1":
                System.out.println("Инструкция if:\n");
                System.out.println("if(условие) инструкцияж");
                System.out.println("else - инструкция;");
                break;
            case "2":
                System.out.println("Инcтpyкция switch :\\n ");
                System.out.println("switch ( выражение ) {");
                System.out.println("case константа :");
                System.out.println("последовательность инструкций");
                System.out.println("break; ");
                System.out.println("// . ..");
                System.out.println("}");
                break;
            default:
                System.out.println("Запрос не найден.");
        }
    }
}
