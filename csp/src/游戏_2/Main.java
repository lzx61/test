package 游戏_2;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] nums = new int[n];
        int tag = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = i;
            nums[i] = i;
        }
        int i = -1;
        int last = 0;
        int c = 1;
        while (true) {
            if (tag == n-1) {
                break;
            }
            i++;
            //System.out.println("轮到"+i+"了");
            if (i == n) {
                i = 0;
            }
            if (nums[i] == -1) {
                //System.out.println("他已经死了");
                continue;
            }
            if (judge(k, c)) {
               // System.out.println(i+"死了");
                tag++;
                remov(nums, i);
            } else {
               // System.out.println(i+"说"+c);
                last = i;
            }
            c++;
        }
        System.out.println(last+1);

    }

    public static boolean judge(int k, int t) {
        if ((t - k) % 10 == 0 || t % k == 0) {
            return true;
        }
        return false;
    }

    public static int[] remov(int[] nums, int index) {
        nums[index] = -1;
        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] != -1) {
                nums[i] = nums[i] - 1;
            }
        }
        return nums;
    }
}


