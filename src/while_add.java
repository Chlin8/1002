public class while_add {

    public static void main(String[] args) {
        // 顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);

        Integer i,num;
        Integer sum=0;
        double avg;

        i=1;
        System.out.println("請輸入第" + i + "個數字");
        num = sc.nextInt();

        while(num !=99999)
        {
            sum = sum + num;

            i++;
            System.out.println("請輸入第" + i + "個數字");
            num = sc.nextInt();
        }

        avg = sum / 10;

        System.out.println(sum);
        System.out.println(avg);
    }
}
