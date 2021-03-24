package stuck_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int si = 0;
        int sj = 0;
        int ti = 0;
        int tj = 0;
        int count = 0;
        char[][][] rows = new char[r][c][2];
        for (int i = 0; i < r; i++) {
            String s = in.nextLine();
            rows[i][0] = s.toCharArray();
            for (int j = 0; j < c; j++) {
                if (rows[i][j][0] == 'S') {
                    si = i;
                    sj = j;
                }
                if (rows[i][j][0] == 'T') {
                    ti = i;
                    tj = j;
                }
            }
        }
        System.out.println("太难了");

    }

}
