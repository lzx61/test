package 卖菜_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num1 = new int[n];
        int[] num2 = new int[n];
        for(int i = 0 ;i<n;i++){
            num1[i] = in.nextInt();
        }
        num2[0]=(num1[0]+num1[1])/2;
        System.out.print(num2[0]+" ");
        for(int i = 1;i<n-1;i++){
            num2[i]=(num1[i-1]+num1[i]+num1[i+1])/3;
            System.out.print(num2[i]+" ");
        }
        num2[n-1]=(num1[n-2]+num1[n-1])/2;
        System.out.print(num2[n-1]);

    }
}
