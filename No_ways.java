//Find the number of ways to divide the given array in two equal parts:

import java.util.Scanner;

public class No_ways {
    static int findWays(int[] arr){
        int n = arr.length;
        int cnt = 0;
        int lhs=0, tot_sum = 0;
        for(int i: arr) tot_sum += i;
        for(int i: arr){
            lhs += i;
            if(lhs == tot_sum/2) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Now enter the elements of array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = findWays(arr);

        System.out.println("Total no.of ways to divide the array into two equal parts is: " + ans);
    }
}
