package solutions;

public class Henry {
    public static void main(String[] args) {
        System.out.println(henry(1, 3));
    }

    static int henry(int i, int j) {
        int max = Integer.MAX_VALUE;
        int count = 0;
        int ith = 0;
        int jth = 0;


        for (int number = 1; number < max; number++) {
            int sum = 0;
            for (int k = 1; k < number; k++) {
                if (number % k == 0) {
                    sum += k;
                }
            }

            if (sum == number) {
                count++;
                if (count == i) {
                    ith = number;
                }
                else if (count == j) {
                    jth = number;
                    break;
                }
            }


        }
        return ith + jth;
    }
}
