public class comput {

    public static void main(String[] args) {
        // 顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("請輸入兩個整數:");
        int A = sc.nextInt();
        int B = sc.nextInt();

        int Sum = A+B;
        int Sub = A-B;
        int Mul = A*B;


        System.out.println(Sum + Sub +  Mul);

    }

}
