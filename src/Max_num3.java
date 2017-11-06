public class Max_num3 {
    public static void main(String[] args) {
        // 顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("請輸入三個數字");
        Integer Num1= sc.nextInt();
        Integer Num2= sc.nextInt();
        Integer Num3= sc.nextInt();

        if( (Num1 > Num2) && (Num1 > Num3)){

            System.out.println(Num1 + " is the biggest number");
        }
        else{

            if (Num2 > Num3){
                System.out.println(Num2 + " is the biggest number");
            }
            else{
                System.out.println(Num3 + " is the biggest number");
            }
        }

    }
}
