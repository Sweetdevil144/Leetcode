import java.util.*;
public class findDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(func(arr));
    }
    public static int func(int[] arr) {
        int i=0;int correct,swap,duplicate;duplicate=-1;
        while(i<arr.length) {correct=arr[i]-1;
            if(arr[i]==i+1) {
                i++;
            }
            else if(arr[correct] == arr[i]) {
                duplicate=arr[i];
                i++;
            }
            else {
                swap=arr[i];
                arr[i]=arr[correct];
                arr[correct]=swap;
            }
        }
        return duplicate;
    }
}