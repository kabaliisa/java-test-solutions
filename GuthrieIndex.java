package solutions;

public class GuthrieIndex {
    public static void main(String[] args) {
        System.out.println(guthrieIndex(1));
    }

    static int guthrieIndex(int n) {
        int iterations = 0;
        if (n == 1) return 0;
        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
                iterations++;
            }
            else {
                n = n * 3 + 1;
                iterations++;
            }

        }
        return iterations;
    }
}
