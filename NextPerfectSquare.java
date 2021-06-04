package solutions;

public class NextPerfectSquare {
    public static void main(String[] args) {
        System.out.println(nextPerfectSquare(6));
    }

    static int nextPerfectSquare(int n) {
        if (n == 0) return 1;

        for (int i = 0; i < n; i++) {
            if (i * i > n) {
                return i * i;
            }
        }
        return 0;

    }
}
