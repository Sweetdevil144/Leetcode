import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(arr);
    }
    public static int findPeakElement(int[] arr) {
        int start=0;int end=arr.length-1;int mid=0;
        while(start<end) {
            mid=(start+end)/2;
            if(arr[mid+1]>arr[mid]) {
                start=mid+1;
            }
            if(arr[mid]>arr[mid+1]) {
                end=mid;
            }
        }
        return start;
    }
}
