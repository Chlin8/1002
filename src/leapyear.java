public class leapyear {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        int Years = sc.nextInt();

        if (Years%400==0 || ((Years%4==0)&&(Years%100!=0)))
        {
            System.out.println(Years+"是閏年");
        }
        else
        {
            System.out.println(Years + "非閏年");
        }
    }
}
