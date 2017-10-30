public class buy_ticket {
    public static void main(String[] args) {
        // 顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("請輸入身高");
        int height= sc.nextInt();

        if (height >120){
            System.out.println("請購買全票");
        }
        else
        {
            System.out.println("可購買半票");
        }
    }
}
