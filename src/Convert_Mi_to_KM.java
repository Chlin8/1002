public class Convert_Mi_to_KM {

    public static void main(String[] args) {
        // 顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("請輸入英里");
        double mi= sc.nextDouble();

        double km = mi * 1.6;
        System.out.println("英里：" + mi);
        System.out.println("公里：" + km);
    }
}
