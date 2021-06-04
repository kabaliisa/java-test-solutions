public class Inertial {
    public static void main(String[] args) {
        int[] c = { 11, 4, 20, 9, 2, 8 };
        System.out.println(isInertial(c));
    }

    static int isInertial(int[] a) {
        int maxValue = 0;
        int oddValue;

        for (int k = 0; k < a.length; k++) {
            if (a[k] > maxValue) {
                maxValue = a[k];
            }
        }
        if (maxValue % 2 != 0) {
            return 0;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                oddValue = a[i];
                int evenValue = 0;
                for (int j = 0; j < a.length; j++) {
                    if (a[j] % 2 == 0) {
                        evenValue = a[j];
                        if (evenValue != maxValue && evenValue > oddValue) {
                            return 0;
                        }
                    }
                }
            }
        }

        return 1;

    }
}
