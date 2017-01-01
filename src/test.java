/**
 * Created by hskim@apexsoft.co.kr on 2017-01-01.
 */
public class test {

    public static void main(String[] args) {

        System.out.println("덧셈");
        System.out.println(add(4,5,6));
    }

    public static int add(int... arr) {
        int re = 0;
        for (int num : arr) {
            re += num;
        }

        return re;
    }
}
