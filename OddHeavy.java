package solutions;

public class OddHeavy {
    public static void main(String[] args) {
        System.out.println(isOddHeavy(new int[] { 1, 1, 1, 1 }));
    }

    static int isOddHeavy(int[] a) {
        boolean isOddHeavy = true;
        int oddElement = 0;
        for (int i = 0; i < a.length; i++) {
            // int  oddElement = 0;
            if (a[i] % 2 == 0) {

            }
            else {
                oddElement = a[i];
            }

            for (int j = 0; j < a.length; j++) {
                if (a[j] % 2 == 0) {
                    if (a[j] > oddElement) {
                        // System.out.println(a[j]);
                        isOddHeavy = false;
                        break;
                    }
                }
            }
        }
        if (isOddHeavy) {
            return 1;
        }
        return 0;
    }
}
