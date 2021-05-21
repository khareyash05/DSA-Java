package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i=0;i< arr.length;i++){
            arr[i]= input.nextInt();
        }
        System.out.print(bestTime(arr));
    }

    public static int bestTime(int[] arr) {
        int maxprofit=0;
        int minsofar=arr[0];
        for (int i=0;i<arr.length;i++){
            minsofar = Math.min(minsofar,arr[i]);
            int profit = arr[i]-minsofar;
            maxprofit = Math.max(maxprofit,profit);
        }
        return maxprofit;
    }


}
