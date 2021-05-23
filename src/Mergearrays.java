import java.util.*;

public class Mergearrays {
    public static void main(String[]args){
        int[] a = new int[] { 1, 5, 9, 10, 15, 20 };
        int[] b = new int[] { 2, 3, 8, 13 };
        int i = 0, j = 0, k = a.length;
        while (i < k && j < b.length) {
            if (a[i] < b[j])
                i++;
            else {
                int temp = b[j];
                b[j] = a[k];
                a[k] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int x=0;x<a.length;x++)
            System.out.print(a[x]+" ");
        for(int x=0;x<b.length;x++)
            System.out.print(b[x]+" ");
    }
}
