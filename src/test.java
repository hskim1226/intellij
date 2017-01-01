/**
 * Created by hskim@apexsoft.co.kr on 2017-01-01.
 */
public class test {

    public static void main(String[] args) {

        System.out.println("덧셈: " + add(4, 5, 6));
        System.out.println("뺄셈: " + sub(5, 4, 8));
        System.out.println("나눗셈: " + div(10,2,15));
    }

    private static int add(int... arr) {
        int re = 0;
        for (int num : arr) {
            re += num;
        }

        return re;
    }

    private static int sub(int... arr) {
        int re = 0;
        for (int num : arr) {
            if (isbigNum(re, num)) {
                re -= num;
            } else re = num - re;
        }
        return re;
    }
    private static int div(int... arr){
        int re = 1;
        for (int num : arr) {
            if (isbigNum(re, num)) {
               re=re/num;
            } else re = num/re;
        }
        return re;

    }

    private static boolean isbigNum(int a, int b) {

        return a > b;
    }
}
