package 最小差值_1;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i]=in.nextInt();
        }
        Arrays.sort(nums);
        int min = 10000;
        for(int i = 1;i<n;i++){
            min=(min<nums[i]-nums[i-1]?min:nums[i]-nums[i-1]);
        }
        System.out.println(min);
    }
}


