package solutions;

public class GoodSpread {
    public static void main(String[] args) {
        System.out.println(goodSpread(new int[] { 2, 1, 2, 5, 2, 1, 5, 9 }));
    }

    static int goodSpread(int[] a) {
        for (int i : a) {
            int count = 0;
            for (int j : a) {
                if (i == j) {
                    count++;
                }
            }
            if (count > 3) return 0;
        }
        return 1;
    }
}
