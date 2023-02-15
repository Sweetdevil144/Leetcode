import java.util.Scanner;

public class DifferenceOfSums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(differenceOfSum(arr));
    }
    public static int differenceOfSum(int[] nums) {
        int difference=0;int sum,digSum;
        sum=Sum(nums); digSum=DigitalSum(nums);
        difference=sum-digSum;
        return Math.abs(difference);
    }
    public static int Sum(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public  static int DigitalSum(int[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            while(arr[i]>0) {
                int d=arr[i]%10;
                sum+=d;
                arr[i]/=10;
            }
        }
        return sum;
    }
}
