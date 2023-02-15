import java.util.Scanner;

public class MaxPositiveAndNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println();
    }
    public static int maximumCount(int[] arr) {
        if(arr[arr.length-1]==0) return 0;
        if(arr[arr.length-1]<0) return arr.length;
        int negative_pos=max_pos(arr);
        int positive_pos=arr.length-func(arr);
        if(negative_pos>positive_pos) return negative_pos;
        else return positive_pos;
    }
    public static int max_pos(int[] arr) {
        int start=0;int end=arr.length-1;int mid=0;
        while(start<end) {
            mid=(start+end)/2;
            if(arr[mid]<0) start=mid+1;
            else end=mid;
        }
        return end;
    }
    public static int func(int[] arr) {
        int start=0;int end=arr.length-1;
        while(start<end) {
            int mid=(start+end)/2;
            if(arr[mid]<=0) start=mid+1;
            else end=mid;
        }
        return start;
    }
}
