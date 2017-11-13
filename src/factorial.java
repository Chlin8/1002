public class factorial {

    public static void main(String[] args) {
        // 顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);

        Integer num, i;
        double factorial_value=1;

        System.out.println("請輸入計算幾階層");
        num = sc.nextInt();

        for(i=1;i<=num;i++)
        {

            factorial_value = factorial_value * i;

        }


        System.out.println(num + "!=" + factorial_value);

    }
}
