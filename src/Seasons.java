public class Seasons {

    public static void main(String[] args) {
        // 顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int Month = sc.nextInt();

        if ((Month>=1) && (Month<=12)) {
            if ((Month >= 3) && (Month <= 5)) {
                System.out.println("Spring");
            }

            if ((Month >= 6) && (Month <= 8)) {
                System.out.println("Summer");
            }


            if ((Month >= 9) && (Month <= 11)) {
                System.out.println("Fall");
            }

            if ((Month >= 12) || (Month <= 2)) {
                System.out.println("Winter");
            }
        }
        else
        {
            System.out.println("ERROR!!");
        }



    }
}
