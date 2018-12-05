public class for_test {

    public static void main(String[] args) {
        // 顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);

        Integer i,num;
        Integer sum=0;

        double avg;

        for(i=1;i<=10;i++)
        {
            System.out.println("請輸入第" + i + "個數字");
            num = sc.nextInt();
            sum = sum + num;
        }

        avg = sum / 10;

        System.out.println(sum);
        System.out.println(avg);
    }
}
