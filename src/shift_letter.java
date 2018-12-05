import java.util.Scanner;

public class shift_letter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String message = in.nextLine();
        int n = Integer.parseInt(in.nextLine());
        char str[] = message.toCharArray();
        int i;
        for(i=0;i<str.length;i++)
        {
            if(str[i]>='A' && str[i]<='Z')
            {
                str[i]=(char)(((str[i] - 'A')+n)%26+'A');
            }
            else
            {
                if (str[i]>='a' && str[i]<='z')
                {
                    str[i]=(char)(((str[i] - 'a')+n)%26+'a');
                }
                else
                {
                    if (str[i]>='0' && str[i]<='9')
                    {
                        str[i]=(char)(((str[i] - '0')+n)%10+'0');
                    }
                }

            }

            System.out.print(str[i]);
        }

        System.out.println();
    }
}
