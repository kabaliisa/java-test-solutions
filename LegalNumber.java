package solutions;

public class LegalNumber {
    public static void main(String[] args) {
        System.out.println(convertToBase10(new int[] { 3, 7, 1 }, 6));
    }

    static int isLegalNumber(int[] a, int n) {
        for (int i : a) {
            if (i > n) {
                return 0;
            }
        }
        return 1;
    }

    static int convertToBase10(int[] a, int n) {
        int base10Number = 0;

        if (isLegalNumber(a, n) == 1) {
            for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
                base10Number += a[i] * Math.pow(n, j);
            }
            return base10Number;
        }
        return -1;
    }
}
