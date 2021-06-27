package solutions;

public class MeeraArray {
    public static void main(String[] args) {
        System.out.println(isMeeraArray(new int[] { 3, 7, 0, 8, 0, 5 }));

    }

    static int isMeeraArray(int[] a) {
        boolean isPrime = false;
        boolean isZero = false;
        for (int i = 0; i < a.length; i++) {
            isPrime = false;
            isZero = false;
            for (int j = 2; j < a[i]; j++) {
                if (a[i] % j == 0) {
                    isPrime = true;
                }
            }
            if (a[i] == 0) {
                isZero = true;
            }
        }
        if (isPrime && isZero) {
            return 1;
        }
        else if (!isPrime && !isZero) {
            return 1;
        }
        return 0;

    }
}
