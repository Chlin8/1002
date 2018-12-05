import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String message = in.nextLine();
        char str[] =message.toCharArray();
        int i;
        int L=str.length;

        for(i=0;i<L/2; i++)
        {
            if(str[i]!=str[L-i-1])
            {
                break;
            }
        }
        if(i==L/2)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
