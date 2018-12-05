public class Max_Min_10 {

    public static void main(String[] args) {
        // 顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int i,Max, Min, Num;

        Max = -2147483648;
        Min = 2147483647;

        for(i=1;i<=10;i++)
        {
            Num = sc.nextInt();

            if (Num > Max)
            {
                Max = Num;
            }

            if(Num < Min)
            {
                Min = Num;
            }
        }

        System.out.println(Max + " is Max Number");
        System.out.println(Min + " is Min Number");

    }

}
