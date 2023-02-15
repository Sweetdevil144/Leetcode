import java.util.Scanner;
import java.util.*;
public class NextGreatestLetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] arr=new char[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.next().charAt(i);
        }
        System.out.println();
    }
    public static char nextGreatestLetter(char[] arr, char target) {
        int start,end;start=0;end=arr.length-1; int temp=0;
        while(start<=end) {
            int mid=(start+end)/2;
            if(arr[mid]>target) {
                end=mid-1;
            }
            else if(arr[mid]<=target) {
                start=mid+1;
            }
            temp=mid;
        }
        return arr[start%arr.length];
    }
}
