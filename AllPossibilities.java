package solutions;

public class AllPossibilities {
    public static void main(String[] args) {
        System.out.println(isAllPossibilities(new int[] { 1, 2, 0, 3 }));

    }

    static int isAllPossibilities(int[] a) {
        if (a.length == 0) return 0;
        boolean isPossible = false;
        for (int i = 0; i < a.length; i++) {
            isPossible = false;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {
                    isPossible = true;
                }
            }
            if (!isPossible) {
                return 0;
            }
        }
        return 1;
    }
}
