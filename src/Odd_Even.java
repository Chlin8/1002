public class Odd_Even {
    public static void main(String[] args) {
        // 顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Input a integer number:");
        Integer Num1 = sc.nextInt();

        if (Num1 % 2 == 0)
        {
            System.out.println(Num1  + " is Even Number");
        }
        else
        {
            System.out.println(Num1  + " is Odd Number");
        }



    }
}
