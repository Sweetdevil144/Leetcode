import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(runningSum(n));
    }
    public static int[] runningSum(int[] nums) {
        int[] arr=new int[nums.length]; int sum; arr[0]=nums[0];
        for(int i=1;i<nums.length;i++) {
            arr[i]=nums[i]+arr[i-1];
        }
        return arr;
    }
}
