import java.util.Scanner;
import java.util.*;
public class MissingNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr) {
        int i=0;int correct,swap;
        while(i<arr.length) {
            correct=arr[i];
            if(arr[i]==i) {
                i++;
            }
            else if(arr[i]==arr.length) {
                i++;
            }
            else {
                swap=arr[i];
                arr[i]=arr[correct];
                arr[correct]=swap;
            }
        }
        for(i=0;i<arr.length;i++) {
            if(arr[i] != i) {
                return i;
            }
        }
        return arr.length;
    }
}
