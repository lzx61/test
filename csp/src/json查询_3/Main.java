package json查询_3;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        for(int i = 33;i<127;i++){
            char c = (char)i;
            System.out.println(c);
        }
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String strs = "";
        String[] strs2 = new String[m];
        for (int i = 0; i < n; i++) {
            strs =  strs + in.nextLine();
        }
        for (int j = 0; j < m; j++) {
            strs2[j] = in.nextLine();
        }
        
    }

}
