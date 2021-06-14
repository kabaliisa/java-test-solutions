package solutions;

public class HasNoZeroes {
    public static void main(String[] args) {
        System.out.println(arrayHasNoZeroes(new int[] {
               
        }));
    }

    static int arrayHasNoZeroes(int[] a) {
        for (int i : a) {
            if (i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
