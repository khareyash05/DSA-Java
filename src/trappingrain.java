import java.util.*;

public class trappingrain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(trap(arr));
        input.close();
    }

    public static int trap(int[] arr) {
        int[] l = new int[arr.length];
        int[] r =new int[arr.length];
        l[0]=arr[0];
        r[arr.length-1]=arr[arr.length-1];
        for(int i=1;i< arr.length;i++)
            l[i] = Math.max(l[i-1],arr[i]);
        for(int i= (arr.length)-2;i>=0;i--)
            r[i] = Math.max(r[i+1],arr[i]);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=(Math.min(l[i],r[i])-arr[i]);
        }
        return sum;
    }
}
