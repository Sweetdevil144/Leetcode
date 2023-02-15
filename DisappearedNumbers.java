import java.util.Scanner;
import java.util.*;
public class DisappearedNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int i=0;int correct,swap;
        ArrayList<Integer> list=new ArrayList<>(5);
        while(i<arr.length)
        { correct=arr[i]-1;
            if(arr[i]==i+1) {
                i++;
            }
            else if(arr[correct]==arr[i]) {
                i++;
            }
            else {
                swap=arr[i];
                arr[i]=arr[correct];
                arr[correct]=swap;
            }
        }
        for(i=0;i<arr.length;i++) {
            if(arr[i] != i+1) {
                list.add(i+1);
            }
        }
        return list;
    }
}
