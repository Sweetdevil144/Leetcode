import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(searchInsert(arr,target));
    }
    public static int searchInsert(int[] arr, int target) {
        int start=0; int end=arr.length-1; int mid;
        if(target==0 && arr[0]>0) {
            return 0;
        }
        if(arr.length==1) {
            if(target<=arr[0]) {
                return 0;
            }
            else {
                return 1;
            }
        }
        while(start<=end) {
            mid= start+(end-start)/2;
            if(arr[mid]>target) {
                end=mid-1;
            }
            else if(arr[mid]<target) {
                start=mid+1;
            }
            else if(arr[mid]==target){
                return mid;
            }
        }
        return start;
    }
}
