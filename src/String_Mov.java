public class String_Mov {

    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();


        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int num=(int)ch;

            if(num>=48&&num<=57) //數字
            {
                num+=n;
                //num=num>57?num-10:num;
                if (num >57)
                {
                    num = num-10;
                }
            }
            else {
                if (num >= 65 && num <= 90)  //大寫
                {
                    num += n;
                    //num = num > 90 ? num - 26 : num;
                    if (num >90)
                    {
                        num = num-26;
                    }
                }
                else
                {
                    if (num >= 97 && num <= 122)  //小寫
                    {
                        num += n;
                        //num = num > 122 ? num - 26 : num;
                        if (num >122)
                        {
                            num = num-26;
                        }
                    }
                }
            }
            System.out.print((char)num);
        }
    }
}
