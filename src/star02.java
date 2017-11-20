public class star02 {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        int i,j;

        for(j=1;j<=5;j++) {

            for (i = 5; i >= j; i--) {
                System.out.print("★");
            }
            System.out.print("\n");
        }



    }
}
