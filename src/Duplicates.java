import java.util.*;

public class Duplicates {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println(finduplicate(arr));
    }

//    public static int finduplicate(int[] arr) {
//        for(int i=0;i<arr.length;i++){
//            for (int j=i+1;j< arr.length;j++){
//                if(arr[i]==arr[j]){
//                    return arr[i];
//                }
//            }
//        }
//        return -1;
//    }
    // The above approach O(n*n) now below  in O(n)
    public static int finduplicate(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<(arr.length)-1;i++){
            if(arr[i]==arr[i+1])
                return arr[i];
        }
        return -1;
    }
}
