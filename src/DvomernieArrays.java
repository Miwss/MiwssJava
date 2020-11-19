public class DvomernieArrays {
    public static void main(String[] args) {
        int[][] num = new int[10][10];
        for (int i = 0; i<num.length; i++)
        {
            for(int j = i; j < num.length; j++)
            {
                System.out.print("*");
                for(int j1=0; j1<i; j1++)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
