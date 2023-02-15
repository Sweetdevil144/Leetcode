import java.util.Scanner;

public class AverageSalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(average(arr));
    }
    public static double average(int[] arr) {
        double max_pos,min_pos;max_pos=0.0 ; min_pos=0.0; double max=arr[0];double min=arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                max=arr[i];max_pos=i;
            }
            if(arr[i]<min) {
                min=arr[i];min_pos=i;
            }
        }
        double sum=0;
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
        }
        sum-=(max+min);
        return (sum/(arr.length-2));
    }
}
