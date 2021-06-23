package solutions;

public class MadhavArray {
    public static void main(String[] args) {
        int[] x = { 6, 2, 4, 2, 2, 2, 1, 5, 0, 0 };
        int i = isMadHavArray(x);
        System.out.println(i);
    }

    static int isMadHavArray(int[] a) {
        int k = 1;
        int p = 2;
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = 0;
            for (int j = k; j < k + p; j++) {
                sum += a[j];

            }
            if (a[0] == sum) {

            }
            else {
                return 0;
            }
            k = k + p;
            p = p + 1;
            if (k == a.length) {
                break;
            }

        }
        return 1;
    }
}
