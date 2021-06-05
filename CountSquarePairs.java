package solutions;

public class CountSquarePairs {
    public static void main(String[] args) {
        int[] k = { 11, 5, 4, 20 };

        System.out.println(countSquarePairs(k));
    }

    static int countSquarePairs(int[] a) {
        if (a.length < 2) return 0;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j] && a[i] > 0 && a[j] > 0) {
                    if (isPerfectsquare(a[i] + a[j]) == 1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    static int isPerfectsquare(int n) {
        for (int i = 0; i < n; i++) {
            if (i * i == n) {
                return 1;
            }

        }
        return 0;
    }
}
