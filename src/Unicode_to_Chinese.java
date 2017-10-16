public class Unicode_to_Chinese {

    public static void main(String[] args) {
        // 顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);

        String ch = sc.next();

        int v1 = Integer.valueOf(ch, 16);

        System.out.println((char) v1);

    }
}
