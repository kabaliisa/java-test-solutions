package solutions;

public class FindPorcupineNumber {
    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(139));
    }

    static int findPorcupineNumber(int n) {
        boolean isPorcupine = false;
        int porcupineNumber = 0;
        n++;
        while (n < (int) Math.pow(2, 31) - 1) {
            if (isPorcupine) {
                if (isPrime(n) == 1) {
                    if (n % 10 == 9) {
                        break;
                    }
                    else {
                        isPorcupine = false;
                    }
                }
            }
            else {
                if (isPrime(n) == 1) {
                    if (n % 10 == 9) {
                        isPorcupine = true;
                        porcupineNumber = n;
                    }
                }
            }
            n++;
        }
        return porcupineNumber;

    }

    static int isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
