package solutions;

public class Divisible {
    public static void main(String[] args) {

        System.out.println(isDivisible(new int[] { }, 1));
    }

    static int isDivisible(int[] a, int n) {
        for (int i : a) {
            if (i % n != 0) {
                return 0;
            }
        }
        return 1;
    }
}
