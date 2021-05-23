import java.util.*;

public class Twosum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the array");
        for(int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        int target;
        System.out.println("Enter target");
        target = input.nextInt();
        twosum(arr,target);
        input.close();
    }

    public static void twosum(int[] arr,int x) {
        Arrays.sort(arr);
        int start = 0,end=arr.length-1;
        while(start<end){
            if(arr[start]+arr[end]==x){
                System.out.println(arr[start]+","+arr[end]);
                start++;end--;
            }
            else if(arr[start]+arr[end]>x) end--;
            else start++;
        }
    }
}
