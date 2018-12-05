public class prime {

    public static void main(String[] args) {
        // 顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int Number = sc.nextInt();

        int i;
        Boolean k=true;

        for(i=2;i<Number;i++)
        {
            if (Number % i == 0) {
                k = false;
                break;
            }
        }

        if (k==true)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not Prime Number");
        }

    }
}
