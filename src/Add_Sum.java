public class Add_Sum {

    public static void main(String[] args) {
        // 顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);

        Integer num, i;
        Integer Sum=0;
        double Avg;

        for(i=1;i<=10;i++)
        {
            System.out.println("請輸入第" + i + "個數字");
            num = sc.nextInt();
            Sum = Sum + num;

        }

        Avg = Sum /10 ;

        System.out.println(Sum);
        System.out.println(Avg);
    }
}
