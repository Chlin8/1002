public class constellation {

    public static void main(String[] args) {
        // 顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int Month = sc.nextInt();
        int Day = sc.nextInt();

        if (Month == 1) {
            if (Day >= 21) {
                System.out.println("Aquarius");
            } else {
                System.out.println("Capricorn");
            }
        }

        if (Month == 2) {
            if (Day >= 19) {
                System.out.println("Pisces");
            } else {
                System.out.println("Aquarius");
            }
        }

    }
}