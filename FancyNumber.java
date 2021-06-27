package solutions;

public class FancyNumber {
    public static void main(String[] args) {
        System.out.println(isFancy(2));
    }

    static int isFancy(int n) {
        int prev1 = 1;
        int prev2 = 1;
        int fancyNumber = 0;
        int k = 0;
        while (k < n) {
            fancyNumber = 3 * prev2 + 2 * prev1;
            if (n == fancyNumber) {
                return 1;
            }
            prev1 = prev2;
            prev2 = fancyNumber;

            k++;
        }
        return 0;
    }
}
