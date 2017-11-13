public class while_addOnetoTen {

    public static void main(String[] args) {
        // 顯示訊息

        Integer i;
        Integer Sum=0;
        double Avg;
        i=1;

        while(i<=10)
        {

            Sum = Sum + i;
            i++;
        }

        Avg = Sum /10 ;

        System.out.println(Sum);
        System.out.println(Avg);
    }

}
