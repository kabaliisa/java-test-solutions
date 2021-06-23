package solutions;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(isFibonacci(13));
    }

    static int isFibonacci(int n) {
        int prev1 = 1;
        int prev2 = 1;
        int fibNumber = 0;
        int k = 1;
        while (k < n) {
            fibNumber = prev1 + prev2;
            prev1 = prev2;
            prev2 = fibNumber;

            if (fibNumber == n) {
                return 1;
            }
            k++;
        }
        return 0;
    }
}
