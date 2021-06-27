package solutions;

public class DualArray {
    public static void main(String[] args) {
        System.out.println(isDual(new int[] { 3, 1, 1, 2, 2 }));
    }

    static int isDual(int[] a) {
        boolean isDual = false;
        int times = 0;
        for (int i = 0; i < a.length; i++) {
            isDual = false;
            times = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    times++;
                }
            }
            if (times != 2) {
                isDual = false;
                break;
            }
            else {
                isDual = true;
            }
        }
        if (!isDual) {
            return 0;
        }
        return 1;
    }
}
