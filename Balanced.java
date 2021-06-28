package solutions;

public class Balanced {
    public static void main(String[] args) {
        System.out.println(isBalanced(new int[] { 7, 15, 2, 3 }));
    }

    static int isBalanced(int[] a) {
        boolean isEven = false;
        boolean isOdd = false;
        for (int i = 0; i < a.length; i++) {
            isEven = true;
            isOdd = true;
            if (i % 2 == 0) {
                if (a[i] % 2 != 0) {
                    isEven = false;
                    break;
                }
            }
            else {
                if (a[i] % 2 == 0) {
                    isOdd = false;
                    break;
                }
            }
        }
        if (isOdd && isEven) {
            return 1;
        }
        return 0;
    }
}
