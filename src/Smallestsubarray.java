import java.util.*;

public class Smallestsubarray {
    public static void main(String[]args){
        int[] arr = {7,0,6,1,4,3,9,0,2,8,11};
        int x = 11;
        int ans = findsmall(arr,arr.length,x);
        System.out.println(ans);
    }

    public static int findsmall(int[] arr, int length, int x) {
        int min_len = length+1;
        for(int i=0;i<length;i++){
            int curr_sum = arr[i];
            if(curr_sum>x) return 1;
            for(int j=i+1;j<length;j++){
                curr_sum+=arr[j];
                if((curr_sum>x) && (j-i+1<min_len)) min_len=j-i+1;
            }
        }
        return min_len;
    }
}
