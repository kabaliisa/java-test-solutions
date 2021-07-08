package solutions;

public class Centered {
    public static void main(String[] args) {
        System.out.println(isCentered(new int[] { 3, 2, 1, 1, 4, 6 }));
    }

    static int isCentered(int[] a) {
        if (a.length == 0) return 0;

        int middle = a.length / 2;
        int middleElement = a[middle];


        if (a.length % 2 == 0) {
            return 0;
        }
        else {
            for (int j = 0; j < middle; j++) {
                if (a[j] < middleElement) {
                    return 0;
                }
            }
            for (int k = middle + 1; k < a.length; k++) {
                if (a[k] < middleElement) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
