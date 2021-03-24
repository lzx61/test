package 小明种苹果_2;
/*
没掉的：
4 74 -7 -12 -5
5 73 -8 -6 59 -4
5 80 -6 73 -3 69
2 10 0
掉了的：
4 10 0 9 0
4 10 -2 7 0
4 10 -3 5 0
4 10 -1 8 0
5 76 -5 -10 60 -2
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] mat = new int[n][];
        int s = 0;
        int[] tags = new int[n];
        int d = 0;
        int e = 0;
        for (int i = 0; i < n; i++) {
            int m = in.nextInt();
            mat[i] = new int[m + 1];
            mat[i][0] = in.nextInt();
            s = s + mat[i][0];
            mat[i][m] = mat[i][0];
            for (int j = 1; j < m; j++) {
                mat[i][j] = in.nextInt();
                if (mat[i][j] > 0) {
                    if (mat[i][j] != mat[i][m]) {
                        s = s - mat[i][m] + mat[i][j];
                        mat[i][m] = mat[i][j];
                        if(tags[i]!=1){
                        d++;}
                        tags[i] = 1;
                    }
                } else {
                    s = s + mat[i][j];
                    mat[i][m] = mat[i][m] + mat[i][j];
                }

            }
        }
        int tag = 0;
        for (int t : tags) {
            if (t == 1) {
                tag++;
                if (tag >= 3) {
                    e++;
                }
            } else {
                tag = 0;
            }
        }
        if (tags.length >= 3) {
            e = e + tags[0] * tags[1] * tags[n - 1] + tags[0] * tags[n - 2] * tags[n - 1];
        }
        System.out.println(s + " " + d + " " + e);
    }
}
