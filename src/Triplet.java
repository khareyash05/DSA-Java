import java.util.*;

public class Triplet {
    public static void main(String[]args){
        int[] arr = {7,0,6,1,4,3,9,0,2,8};
        int target = 11;
        Arrays.sort(arr);
        int i=0,j= arr.length-1,k;
        while (i<j){
            for(k=i+1;k<j;k++){
                if(arr[k]+arr[i]+arr[j]==target){
                    System.out.println(arr[i]+","+ arr[j]+","+arr[k]);
                    i++;j--;
                }
            }
            if(arr[k]+arr[i]+arr[j]>target){
                j--;
            }
            else {
                i++;
            }
        }
    }
}
