/**
 * Created by hskim@apexsoft.co.kr on 2017-01-01.
 */
public class test {

    public static void main(String[] args) {

        System.out.println("덧셈: " + add(4, 5, 6));
        System.out.println("뺄셈: " + sub(5, 4, 8));
    }

    public static int add(int... arr) {
        int re = 0;
        for (int num : arr) {
            re += num;
        }

        return re;
    }

    public static int sub(int... arr) {
        int re = 0;
        for (int num : arr) {
            if (isbigNum(re, num)) {
                re -= num;
            } else re = num - re;
        }
        return re;
    }

    public static boolean isbigNum(int a, int b) {

        return a > b;
    }
}
