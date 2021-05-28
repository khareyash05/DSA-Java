import java.util.*;

public class Jumps {
    public static void main(String[]args){
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int ans = jumps(arr,0);
        System.out.println(ans);
    }

    public static int jumps(int[] arr, int i) {
        int count =0,k=0;
        if(i+arr[i]>= arr.length-1){
            count++;
            return count;
        }
        for(k=i+1;k<=i+arr[i];k++){
            if(k+arr[k]>= arr.length-1){
                count++;
                return count;
            }
        }
        count++;
        jumps(arr,k);
        return count;
    }

}
