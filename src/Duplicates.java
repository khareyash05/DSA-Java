import java.util.*;

public class Duplicates {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        int n = finduplicate(arr);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    public static int finduplicate(int[] arr) {
        if(arr.length==0||arr.length==1) return arr.length;
        Arrays.sort(arr);
        int j=0;
        for(int i=0;i<(arr.length)-1;i++){
            if(arr[i]!=arr[i+1])
                arr[j++]=arr[i];
        }
        arr[j++]=arr[arr.length-1];
        return j;
    }
}
