package 稀疏向量_2;
/*
10 3 4
4 5
7 -3
10 1
1 10
4 20
5 30
7 40
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, a, b;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        a = scan.nextInt();
        b = scan.nextInt();
        int[][] as = new int[2][a];
        int[][] bs = new int[2][b];
        for (int i = 0; i < a; i++) {
            as[0][i] = scan.nextInt();
            as[1][i] = scan.nextInt();
        }
        for (int i = 0; i < b; i++) {
            bs[0][i] = scan.nextInt();
            bs[1][i] = scan.nextInt();
        }
        long s = 0;
        int j = 0;
        for (int i = 0; i < a; i++) {
            if (as[0][i] > bs[0][j]) {

                for (; as[0][i] > bs[0][j]; j++) {
                    if (j == b-1) {
                        break;
                    }
                }
            }

            if (as[0][i] == bs[0][j]) {
                s = s + as[1][i] * bs[1][j];
            }
            if (j == b-1) {
                break;
            }

        }
        System.out.println(s);

    }
}
