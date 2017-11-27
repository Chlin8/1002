public class Sum_String {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        String String1 = sc.next();

        int i,sum = 0;

        char[] ch_array = String1.toCharArray();

        for(i=0;i<ch_array.length;i++)
        {
            int c = ch_array[i]-'0';

            sum += c;
        }

        System.out.println(sum);
    }
}
