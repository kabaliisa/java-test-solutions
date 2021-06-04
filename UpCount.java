package solutions;

public class UpCount {
    public static void main(String[] args) {
        int[] k = { 6, 3, 1 };
        System.out.println(nUpCount(k, 6));
    }

    static int nUpCount(int[] arr, int n) {
        int sum = 0;
        int partialSum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            partialSum = sum;
            sum += arr[i];
            if (partialSum <= n && sum > n) {
                count++;
            }
        }
        return count;
    }
}
