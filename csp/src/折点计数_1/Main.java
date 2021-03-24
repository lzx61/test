package 折点计数_1;
/*
7
5 4 1 2 3 6 4
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        int downtag = 0;
        int uptag = 0;
        int count = 0;

        for (int j = 1; j < n; j++) {
            if (nums[j] > nums[j - 1]) {
                if (downtag == 1) {
                    count++;
                }
                uptag = 1;
                downtag = 0;
            } else {
                if (uptag == 1) {
                    count++;
                }
                uptag = 0;
                downtag = 1;
            }
        }
        System.out.println(count);

    }
}
