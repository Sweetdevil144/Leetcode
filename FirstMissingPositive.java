import java.util.Scanner;
import java.util.*;
public class FirstMissingPositive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(firstMissingPositive(arr));
    }
    public static int firstMissingPositive(int[] arr) {
        int i=0;int swap,correct;
        while(i<arr.length) {
            correct=arr[i]-1;
            if(arr[i] <= 0 || arr[i]==i+1 || arr[i]>=arr.length ) {
                i++;
            }
            else if(arr[i]==arr[correct]) {
                i++;
            }
            else {
                swap=arr[i];
                arr[i]=arr[correct];
                arr[correct]=swap;
            }
        }
        for(i=0;i<arr.length;i++) {
            if(arr[i]!=i+1) {
                return i+1;
            }
        }
        return arr.length+1;
    }
}
