import java.util.Scanner;

public class HeightChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(heightChecker(arr));
    }
    public static int heightChecker(int[] nums) {
        int c=0;int swap;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            arr[i]=nums[i];
        }
        for(int i= 0;i<arr.length;i++) {
            for(int j=0;j<arr.length-1;j++) {
                if(arr[j]>arr[j+1]) {

                    swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }
        for(int i=0;i<nums.length;i++) {
            if(arr[i]!=nums[i]) {
                c++;
            }
        }
        return c;
    }
}
