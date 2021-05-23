import java.util.*;

public class Ui {
    public static void main(String[] args){
        int[] a = new int[] { 1, 5, 9, 10, 15, 20 };
        int[] b = new int[] { 2, 5, 8, 15 };
        printintersection(a,b);
//        printunion(a,b);
    }

    public static void printintersection(int[] a, int[] b) {
        int i=0,j=0;
        while(i<a.length&&j<b.length){
            if(a[i]<b[j])
                i++;
            else if(b[j]<a[i])
                j++;
            else {
                System.out.print(a[i++] + " ");
                j++;
            }
        }
    }
}
