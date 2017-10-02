public class ConvertTemp {


    public static void main(String[] args) {
        // 顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("請輸入攝氏溫度");
        double C_Temp = sc.nextDouble();

        double T_Temp = C_Temp * 9 / 5 + 32;
        System.out.println("攝氏溫度：" + C_Temp);
        System.out.println("華氏溫度：" + T_Temp);
    }
}
