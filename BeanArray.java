package solutions;

public class BeanArray {
    public static void main(String[] args) {
        System.out.println(isBeanArray(new int[] { 3, 4, 5, 7 }));
    }

    static int isBeanArray(int[] a) {
        boolean isBean = false;
        for (int i = 0; i < a.length; i++) {
            isBean = false;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j] + 1 || a[i] == a[j] - 1) {
                    isBean = true;
                    break;
                }
            }


        }
        if (isBean) {
            return 1;
        }

        return 0;

    }
}
