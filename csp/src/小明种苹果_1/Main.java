package 小明种苹果_1;
/*
3 3
73 -8 -6 -4
76 -5 -10 -8
80 -6 -15 0
 */
/*
2 2
10 -3 -1
15 -4 0
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] mat = new int[n][m+2];
        int s = 0;
        int max = 1;
        for(int i=0;i<n;i++){
            mat[i][0]=in.nextInt();
            s=s+mat[i][0];
            for(int j = 1;j<m+1;j++){
                mat[i][j]=in.nextInt();
                s=s+mat[i][j];
                mat[i][m+1]=mat[i][m+1]-mat[i][j];
            }
            if(mat[i][m+1]>mat[max-1][m+1]){
                max=i+1;
            }
        }
        System.out.print(s+" "+max+" "+mat[max-1][m+1]);
    }
}
