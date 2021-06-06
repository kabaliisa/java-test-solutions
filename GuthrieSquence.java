package solutions;

public class GuthrieSquence {
    public static void main(String[] args) {
        System.out.println(isGuthrieSequence(new int[] {
                8, 4, 2, 1
        }));
    }

    static int isGuthrieSequence(int[] a) {
        int isGuthrieSequence = 0;
        int nextItem = a[0];
        if (a[a.length - 1] != 1) return 0;

        for (int i = 0; i < a.length; i++) {
            if (nextItem == a[i]) {
                isGuthrieSequence = 1;
                if (a[i] % 2 == 0) {
                    nextItem = a[i] / 2;
                }
                else {
                    nextItem = a[i] * 3 + 1;
                }
            }
            else {
                isGuthrieSequence = 0;
                break;
            }

        }
        return isGuthrieSequence;
    }
}
