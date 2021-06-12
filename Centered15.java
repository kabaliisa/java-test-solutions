package solutions;

public class Centered15 {
    public static void main(String[] args) {

        System.out.println(isCentered15(new int[] { 9, 15, 6 }));
    }

    static int isCentered15(int[] a) {

        int mid = a.length / 2;
        int lower = 0;
        int upper = 0;
        if (a.length % 2 == 0) {
            lower = mid - 1;
            upper = mid;
        }
        else {
            lower = mid;
            upper = lower;
        }
        int sum = 0;
        while (lower >= 0 && upper < a.length) {
            for (int i = lower; i <= upper; i++) {
                sum += a[i];
                System.out.println(sum);

                if (sum == 15) {
                    return 1;
                }
            }
            lower--;
            upper++;
        }


        return 0;


    }
}
