public class RangeSumQuery {
    public static int rangeSum(int[] arr, int l, int r){
        int n = arr.length;
        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return l == 0 ? prefix[r]: prefix[r] - prefix[l - 1];

    }

    public static void main(String[] args) {
        int arr[] = {2,4,5,8,10};
        System.out.println(rangeSum(arr, 1,3));
    }
}
