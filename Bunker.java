package solutions;

public class Bunker {
    public static void main(String[] args) {
        System.out.println(isBunker(8));
    }

    static int isBunker(int n) {
        int i = 1;
        int k = 1;
        int j = 0;
        while (i <= n) {
            j = i + k;
            i = j;
            if (i == n) {
                return 1;
            }
            k++;
        }
        return 0;
    }
}
