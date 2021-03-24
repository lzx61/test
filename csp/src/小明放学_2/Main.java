package 小明放学_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int y = in.nextInt();
        int g = in.nextInt();
        int n = in.nextInt();
        int s = 0;
        int[][] nums = new int[n][2];
        for (int i = 0; i < n; i++) {
            nums[i][0] = in.nextInt();
            nums[i][1] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            nums[i] = count1(nums[i], r, y, g);
            int temp = count2(nums[i], r);
            s = s + temp;
            for (int j = 0; j < n; j++) {
                if (nums[j][0] != 0) {
                    nums[j][1] = nums[j][1] - temp;
                }
            }
        }
        System.out.println(s);
    }

    public static int[] count1(int[] num, int r, int y, int g) {

        switch (num[0]) {
            case 0:
                break;
            case 1:
                num[1] = (num[1] + (r + y + g)) % (r + y + g);
                if (num[1] < r) {
                    num[0] = 1;
                } else if (num[1] > r && num[1] < r + y) {
                    num[1] = num[1] - r;
                    num[0] = 2;
                } else {
                    num[1] = num[1] - r - y;
                    num[0] = 3;
                }
                break;
            case 2:
                num[1] = (num[1] + (r + y + g)) % (r + y + g);
                if (num[1] < y) {
                    num[0] = 2;
                } else if (num[1] > y && num[1] < y + g) {
                    num[1] = num[1] - y;
                    num[0] = 3;
                } else {
                    num[1] = num[1] - y - g;
                    num[0] = 1;
                }
                break;
            case 3:
                num[1] = (num[1] + (r + y + g)) % (r + y + g);
                if (num[1] < g) {
                    num[0] = 3;
                } else if (num[1] > g && num[1] < r + g) {
                    num[1] = num[1] - g;
                    num[0] = 1;
                } else {
                    num[1] = num[1] - r - g;
                    num[0] = 2;
                }
                break;
        }
        return num;
    }

    public static int count2(int[] num, int r) {
        int w = 0;
        switch (num[0]) {
            case 0:
                w = num[1];
                break;
            case 1:
                w = num[1];
                break;
            case 2:
                w = num[1] + r;
                break;
            case 3:
                w = 0;
                break;
        }
        return w;
    }
}
