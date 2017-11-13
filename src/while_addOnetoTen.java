public class while_addOnetoTen {

    public static void main(String[] args) {
        // 顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);

        Integer i;
        Integer Sum=0;
        int num;

        double avg;

        i=1;
        System.out.println("請輸入第" + i + "個數字");
        num = sc.nextInt();

        while(num != 99999)
        {
            Sum = Sum + num;

            i++;
            System.out.println("請輸入第" + i + "個數字");
            num = sc.nextInt();
        }
        avg = Sum / (i-1);
        System.out.println(Sum);
        System.out.println(avg);
    }

}
