package 买菜_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] num1 = new int[n][2];
        int count = 0;
        for (int i = 0; i < n; i++) {
            num1[i][0] = in.nextInt();
            num1[i][1] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int begin = in.nextInt();
            int over = in.nextInt();
            for (int j = 0; j < n; j++) {
                if (num1[j][0] <= begin && num1[j][1] >= begin) {
                    if (over <= num1[j][1]) {
                        count = count + over - begin;
                    } else {
                        count = count + num1[j][1] - begin;
                    }
                } else if (num1[j][0] <= over && num1[j][1] >= over) {
                    count = count + over - num1[j][0];
                } else if (num1[j][0] >= begin && num1[j][1] <= over) {
                    count = count + num1[j][1] - num1[j][0];
                }
            }
        }
        System.out.println(count);
    }
}
