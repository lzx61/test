package z型扫描_2;

/*
4
1 5 3 9
3 7 5 6
9 4 6 4
7 3 1 3
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] nums = new int[n][2 * n - 1];
        int begin = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j + begin] = in.nextInt();
            }
            begin++;
        }
        for (int j = 0; j < 2 * n - 1; j++) {
            if (j % 2 == 0) {
                for (int i = n-1; i >=0; i--) {
                    if (nums[i][j] != 0) {
                        System.out.print(nums[i][j] + " ");
                    }
                }
            } else {
                for (int i = 0; i < n; i++) {
                    if (nums[i][j] != 0) {
                        System.out.print(nums[i][j] + " ");
                    }
                }
            }
        }
    }
}


