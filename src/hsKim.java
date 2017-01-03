/**
 * Created by hskim@apexsoft.co.kr on 2017-01-01.
 */
public class hsKim {

    public static void main(String[] args) {

        System.out.println("덧셈: " + add(4, 5, 6));
        System.out.println("뺄셈: " + sub(5, 4, 8));
        System.out.println("나눗셈: " + div(10, 2, 15));
        System.out.println("외국인 인가: " + new Application("F").isForeignAdmission());

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
            if (re > num) {
                re -= num;
            } else re = num - re;
        }
        return re;
    }

    private static int div(int... arr) {
        int re = 1;
        for (int num : arr) {

            if (re > num) {
                re = re / num;
            } else re = num / re;
        }
        return re;

    }


    public static class Application {
        private String id;
        private String admissionType;

        Application(String admissionType) {

            this.admissionType = admissionType;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getAdmissionType() {
            return admissionType;
        }

        public void setAdmissionType(String admissionType) {
            this.admissionType = admissionType;
        }

        public boolean isForeignAdmission() {

            return "F".equals(getAdmissionType()) || "G".equals(getAdmissionType()) || "H".equals(getAdmissionType()) || "I".equals(getAdmissionType());
        }
    }

}
