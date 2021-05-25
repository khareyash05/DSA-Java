import java.util.*;

public class Chocolatedistribute {
    public static void main(String[]args){
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;
        Arrays.sort(arr);
        if(arr.length<m) System.out.print("Cant divide");
        int mindiff = Integer.MAX_VALUE;
        for(int i=0;i+m-1<arr.length;i++){
            int diff = arr[i+m-1]-arr[i];
            if(diff<mindiff) mindiff=diff;
        }
        System.out.print(mindiff);
    }
}
