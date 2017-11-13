public class grade {
    public static void main(String[] args) {
        // 顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("請輸入成績");
        Integer grade= sc.nextInt();

        if(grade > 60 ){
            System.out.println(grade + "分,成績及格");
        }
        else{
            if(grade < 50){
                System.out.println(grade + "分,死當");
            }
            else{
                System.out.println(grade + "分,可以補考");
            }

        }
    }
}
