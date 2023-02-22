import java.util.Scanner;

public class SearchInRotatedArray {
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
        int peak;
        if(arr.length>1 && arr[0]>arr[1]) {
            peak=0;
        }
        else peak=findPeakElement(arr);
        int start=0,end=peak;
        while(start<=end) {
            int mid=(start+end)/2;
            if(arr[mid]>target) end=mid-1;
            else if(arr[mid]<target) start=mid+1;
            else return mid;
        }
        start=peak+1;end=arr.length-1;
        while(start<=end) {
            int mid=(start+end)/2;
            if(arr[mid]>target) end=mid-1;
            else if(arr[mid]<target) start=mid+1;
            else return mid;
        }

        return -1;
    }
    public static int findPeakElement(int[] arr) {

        int start=0;int end=arr.length-1;int mid=0;
        while(start<end) {
            mid=(start+end)/2;
            if(mid<arr.length-1 && arr[mid]>arr[mid+1]) return mid;

            if(mid>0 && arr[mid]<arr[mid-1]) return (mid-1);

            if(arr[start]>=arr[mid]) {
                end=mid-1;
            }
            else if(arr[start]<arr[mid]) {
                start = mid + 1;
            }
        }
        return start;
    }
}
