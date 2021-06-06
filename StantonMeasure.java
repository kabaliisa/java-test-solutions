package solutions;

public class StantonMeasure {
    public static void main(String[] args) {
        System.out.println(isStantonMeasure(new int[] { 1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4 }));
    }

    static int isStantonMeasure(int[] a) {
        int nCount = 0;
        int nTimes = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                nCount++;
            }
        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] == nCount) {
                nTimes++;
            }
        }

        return nTimes;
    }
}
