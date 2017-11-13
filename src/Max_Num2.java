public class Max_Num2 {

    public static void main(String[] args) {
        // 顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("請輸入五個數字");
        Integer Num1= sc.nextInt();
        Integer Num2= sc.nextInt();
        Integer Num3= sc.nextInt();
        Integer Num4= sc.nextInt();
        Integer Num5= sc.nextInt();

        Integer Max=-32168;

        if(Num1 > Max){
            Max = Num1;
        }

        if(Num2 > Max){
            Max = Num2;
        }

        if(Num3 > Max){
            Max = Num3;
        }

        if(Num4 > Max){
            Max = Num4;
        }
        if(Num5 > Max){
            Max = Num5;
        }

        System.out.println(Max + " is the biggest number");



    }
}
