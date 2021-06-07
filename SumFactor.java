package solutions;

public class SumFactor {
    public static void main(String[] args) {
        System.out.println(sumFactor(new int[] { 0, 0, 0 }));
    }

    static int sumFactor(int[] a) {
        if (a.length == 0) return 0;
        int sum = 0;
        int sumfactor = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        for (int j : a) {
            if (sum == j) {
                sumfactor++;
            }
        }

        return sumfactor;
    }
}
