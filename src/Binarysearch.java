import java.util.*;

public class Binarysearch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int n = arr.length;
        for(int i=0;i< arr.length;i++){
            arr[i]= input.nextInt();
        }
        int key;
        key = input.nextInt();
        System.out.println(binsearch(arr,0,n-1,key));
    }

    public static int binsearch(int[] arr ,int l,int r,int key) {
        if(l>r)
            return -1;
        int mid= (l+r)/2;
        if(arr[mid]==key)
            return mid;
        if(arr[mid]<key){
            binsearch(arr,mid+1,r,key);
        }
        return  binsearch(arr,l,mid-1,key);
    }
}
