public class while_addOnetoTen {

    public static void main(String[] args) {
        // 顯示訊息

        Integer i;
        Integer Sum=0;

        i=1;
        while(Sum<500)
        {
            Sum = Sum + i;
            i++;
        }

        System.out.println(Sum);
        System.out.println(i-1);
    }

}
