/**
 * Created by hskim@apexsoft.co.kr on 2017-01-01.
 */
public class test {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        System.out.println("덧셈");
        System.out.println(add(arr));
    }

    public static int add(int[] arr) {
        int re = 0;
        for (int num : arr) {
            re += num;
        }

        return re;
    }
}
