package solutions;

public class DaphneArray {
    public static void main(String[] args) {
        System.out.println(isDaphne(new int[] { 4, 8, 6, 3, 2, 9, 8, 11, 8, 13, 12, 12, 6 }));
    }

    static int isDaphne(int[] a) {
        int startEven = 0;
        int endEven = 0;
        boolean containsOdd = false;

        int mid = 0;

        if (a.length % 2 == 0) {
            mid = a.length / 2 - 1;
        }
        else {
            mid = a.length / 2;
        }


        for (int i = 0; i < mid; i++) {
            startEven++;

        }
        for (int i = mid + 1; i < a.length; i++) {
            endEven++;
        }

        for (int i : a) {
            if (i % 2 == 0) {

            }
            else {
                containsOdd = true;
                // break;
            }
        }

        if (startEven == endEven && containsOdd) {
            return 1;
        }
        return 0;

    }
}
