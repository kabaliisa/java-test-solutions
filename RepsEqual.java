package solutions;

public class RepsEqual {
    public static void main(String[] args) {
        System.out.println(repsEqual(new int[] { 3, 2, 0, 5, 3 }, 32053));
    }

    static int repsEqual(int[] a, int n) {

        int k;
        int i = a.length - 1;

        while (n > 0) {

            k = n % 10;

            if (k != a[i]) return 0;

            n = n / 10;
            i--;

        }

        return 1;
    }
}
