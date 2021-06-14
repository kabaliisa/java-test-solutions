package solutions;

public class Nunique {
    public static void main(String[] args) {
        System.out.println(isNunique(new int[] { 7, 3, 3, 2, 4 }, 11));
    }

    static int isNunique(int[] a, int n) {
        int pairCount = 0;
        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == n) {
                    pairCount++;
                }
            }
        }
        if (pairCount == 1) {
            return 1;
        }

        return 0;
    }
}
