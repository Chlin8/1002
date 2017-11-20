public class TIMES_Table02 {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        int i;
        for(i=1; i<=9; i++) {
            System.out.print("2 X " + i + " = " + 2*i + "\t");
            System.out.print("3 X " + i + " = " + 3*i + "\t");
            System.out.print("4 X " + i + " = " + 4*i + "\t");
            System.out.print("5 X " + i + " = " + 5*i + "\n");
        }

        System.out.print("\n");

        for(i=1; i<=9; i++) {
            System.out.print("6 X " + i + " = " + 6*i + "\t");
            System.out.print("7 X " + i + " = " + 7*i + "\t");
            System.out.print("8 X " + i + " = " + 8*i + "\t");
            System.out.print("9 X " + i + " = " + 9*i + "\n");
        }

        System.out.print("\n");
    }
}
