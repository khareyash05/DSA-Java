import java.util.*;

public class Quicksort {
    public static void main(String[] args){
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        quicksort(arr,0,arr.length-1);
        for(int i=0;i< arr.length;i++)
            System.out.print(arr[i]+" ");
    }

    public static void quicksort(int[] arr,int l,int r) {
        if(l<r){
            int pivot = partition(arr,l,r);
            quicksort(arr,l,pivot-1);
            quicksort(arr,pivot+1,r);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++)
        {
            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot)
            {
                // Increment index of
                // smaller element
                i++;
                swaparr(arr, i, j);
            }
        }
        swaparr(arr, i + 1, high);
        return (i + 1);
    }

    public static void swaparr(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
