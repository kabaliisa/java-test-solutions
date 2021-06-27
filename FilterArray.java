package solutions;

public class FilterArray {
    public static void main(String[] args) {
        System.out.println(isFilter(new int[] { 4, 7, 13 }));
    }

    static int isFilter(int[] a) {
        boolean check1 = true;
        boolean check2 = true;
        for (int i : a) {
            if (i == 9) {
                for (int k : a) {
                    check1 = false;
                    if (k == 11) {
                        check1 = true;
                    }
                }
            }
            if (i == 7) {
                for (int k : a) {
                    if (k == 13) {
                        check2 = false;
                    }
                }
            }
        }
        if (check1 && check2) {
            return 1;
        }

        return 0;
    }
}
