package solutions;

import java.util.Arrays;

public class Solve10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve10()));
        
    }

    static int[] solve10() {
        int[] arr = { 0, 0 };
        int factSum = 0;
        int x = 1;
        int y = 1;

        while (factSum != factorial(10)) {
            x++;
            for (int i = 1; i <= x; i++) {
                factSum = factorial(x) + factorial(i);
                if (factSum == factorial(10)) {
                    y = i;
                    arr[0] = x;
                    arr[1] = y;
                    break;
                }
            }


        }
        return arr;
    }

    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }


}
