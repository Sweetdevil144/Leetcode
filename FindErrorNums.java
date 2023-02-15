import java.util.Scanner;
import java.util.*;
public class FindErrorNums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(findErrorNums(arr));
    }
    public static int[] findErrorNums(int[] arr) {
        int[] nums=new int[2];
        int temp;
        int i = 0;
        int correct;
        while (i < arr.length) {
            correct = arr[i]-1;
            if(arr[i]==i+1) {
                i++;
            }
            else if(arr[correct]==arr[i]) {
                i++;
            }
            else {
                temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                nums[0]=arr[i];
                nums[1]=i+1;
                return nums;
            }
        }
        return nums;
    }
}
