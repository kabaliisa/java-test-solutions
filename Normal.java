package solutions;

public class Normal {
    public static void main(String[] args) {
        System.out.println(isNormal(5));
    }

    static int isNormal(int n) {
        boolean isNormal = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                if (i % 2 == 0) {

                }
                else {
                    isNormal = false;
                    break;
                }
            }
        }
        if (isNormal) {
            return 1;
        }
        return 0;
    }
}
