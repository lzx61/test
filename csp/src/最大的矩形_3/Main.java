package 最大的矩形_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int l = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] >= nums[i]) {
                    l++;
                } else {
                    break;
                }
            }
            for (int j = i + 1; j < n; j++) {
                if (nums[j] >= nums[i]) {
                    l++;
                } else {
                    break;
                }
            }
            max = (l * nums[i] > max ? l * nums[i] : max);
        }
        System.out.println(max);
    }
}
