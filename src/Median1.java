import java.util.*;

public class Median1 {
    public static void main(String[]args){
        int[] a = new int[] { 1, 12, 15, 26, 38 };
        int[] b = new int[] { 2, 13, 17, 30, 45 };
        System.out.println(getMedian(a,b,a.length));
    }

    public static int getMedian(int[] a, int[] b, int startA,int startB,int endA, int endB) {
        if (endA - startA == 1) {
            return (Math.max(a[startA],b[startB])+ Math.min(a[endA], b[endB]))/ 2;
        }
        int m1 = median(a,startA,endA);
        int m2 = median(b,startB,endB);
        if(m1==m2) return m1;
        else if(m1>m2){
            return getMedian(a,b,startA,(endB + startB + 1) / 2,(endA + startA + 1) / 2, endB);
        }
        else{
            return getMedian(a,b,(startA+endA+1)/2,startB,endA,(startB+endB+1)/2);
        }
    }

    public static int median(int[] arr,int start,int end) {
        int n = end - start + 1;
        if (n % 2 == 0) {
            return (arr[start + (n / 2)]+ arr[start + (n / 2 - 1)])/ 2;
        }
        else {
            return arr[start + n / 2];
        }
    }

    // The above 2 functions work in O(logn) now lets work in O(nlogn)

    public static int getMedian(int[] ar1, int[] ar2, int n){
        int j = 0;
        int i = n - 1;
        while (ar1[i] > ar2[j] && j < n && i > -1)
        {
            int temp = ar1[i];
            ar1[i] = ar2[j];
            ar2[j] = temp;
            i--; j++;
        }
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        return (ar1[n - 1] + ar2[0]) / 2;
    }
}
