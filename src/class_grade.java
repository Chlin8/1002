public class class_grade {
    public static void main(String[] args) {
        // 顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("請輸入成績");
        int grade= sc.nextInt();

        if (grade >=80){
            System.out.println("成績A");
        }
        else if(grade>=70){
                    System.out.println("成績B");
                }
                else if(grade>=60){
                        System.out.println("成績C");
                    }
                    else
                    {
                        System.out.println("成績不及格：" + grade);
                    }
    }
}
