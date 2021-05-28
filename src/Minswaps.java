public class Minswaps {
    public static void main(String[]args){
        int arr[] = {2, 1, 5, 6, 3};
        int n = arr.length;
        int k = 3;
        System.out.print(minSwap(arr, n, k) + "\n");
    }

    public static int minSwap(int[] arr, int n, int k) {
        int count=0;
        for(int i=0;i<n;i++) {
            if (arr[i] <= k)
                count++;
        }
        int i=0,j= count-1,bad=0,min_bad=Integer.MAX_VALUE;
        while(j<n) {
            for (int x = i; x <= j; x++) {
                if (arr[x] >= k)
                    bad++;
            }
            min_bad = Math.min(min_bad, bad);
            i++;
            j++;
        }
        return min_bad;
    }
}
