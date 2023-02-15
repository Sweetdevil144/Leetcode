import java.util.Scanner;
import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int target= sc.nextInt();
        System.out.println(twoSum(arr,target));
    }
    public static int[] twoSum(int[] arr, int target) {
        int[] nums=new int[2];
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                if(arr[i]==arr[j] && i==j)
                    break;
                else {
                    if(arr[i]+arr[j]==target) {
                        nums[0]=i;
                        nums[1]=j;
                        return nums;
                    }
                }
            }
        }
        return nums;
    }
}
