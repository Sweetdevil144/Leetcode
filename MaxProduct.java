import java.util.Scanner;
import java.util.*;
public class MaxProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] arr) {
        int max1,max2,result;max1=0;max2=0;result=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max1) {
                max1=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==max1) {
                arr[i]=0;
                break;
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max2) {
                max2=arr[i];
            }
        }
        result=(max1-1)*(max2-1);
        return result;
    }
}
