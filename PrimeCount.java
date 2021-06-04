package solutions;

public class PrimeCount {
    public static void main(String[] args) {
        System.out.println(primeCount(10, 30));
    }

    public static int primeCount(int start, int end) {
        int primeCount = 0;
        boolean isPrime = false;

        for (int k = start; k <= end; k++) {
            for (int i = 2; i < k; i++) {
                if (k % i == 0) {
                    isPrime = false;
                    break;
                }
                else {
                    isPrime = true;
                }
            }
            if (isPrime) {
                primeCount++;
            }
        }
        return primeCount;
    }
    
}
