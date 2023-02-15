import java.util.Scanner;

public class SearchRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(searchRange(arr,target));
    }
    public static int[] searchRange(int[] arr, int target) {
        int start=0;int end=arr.length-1;int mid=0;
        int[] nums={-1,-1};
        while(start<=end) {
            mid=(start+end)/2;
            if(arr[mid]<target) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
            if(arr[mid]==target) {
                nums[0]=mid;
            }
        } start=0;end=arr.length-1;
        while(start<=end) {
            mid=(start+end)/2;
            if(arr[mid]<=target) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
            if(arr[mid]==target) {
                nums[1]=mid;
            }
        }
        return nums;
    }
}
