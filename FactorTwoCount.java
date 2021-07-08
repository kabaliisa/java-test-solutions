package solutions;

public class FactorTwoCount {
    public static void main(String[] args) {
        System.out.println(isFactorTwoCount(27));
    }

    static int isFactorTwoCount(int n) {
        int count = 0;

        while (n % 2 == 0) {
            n /= 2;
            count++;
        }
        return count;
    }
}
