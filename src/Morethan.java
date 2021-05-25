import java.io.*;
import java.util.Arrays;

public class Morethan {
    public static void main(String[]args){
        int[] arr = {3,4,2,3,3,6,3,4,4,4};
        int count=0;
        int k=3;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                count++;
                if(count== arr.length/k)
                    System.out.print(arr[i] + ",");
            }
            else count=0;
        }
    }
}
