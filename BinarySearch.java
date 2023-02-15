import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(search(arr,target));
    }
    public static int search(int[] arr, int target) {
        int start,end,mid;
        start=0;
        end=arr.length-1;
        while(start<=end) {
            mid=(start+end)/2;
            if(arr[mid]<target) {
                start=mid+1;
            }
            else if(arr[mid]>target) {
                end=mid-1;
            }
            else
                return mid;
        }
        return -1;
    }
}
