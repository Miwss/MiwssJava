package Lesson24;

public class Test4 {

}

interface I1{
 default void abc(){
     System.out.println("eto metod abc");
 }
 static void def(){
     System.out.println("static metod");
 }
}



 class R implements I1{
     public static void main(String[] args) {
         I1.def();
     }
}
//class Z2 implements I1{
//    public void abc(){
//        System.out.println("Eto netod abc");
//    }
//
//    public static void main(String[] args) {
//        Z2 z =new Z2();
//        z.abc();
//        z.def();
//        z.ghi();
//    }
//}
