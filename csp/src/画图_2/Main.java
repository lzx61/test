package 画图_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            list = add2List(list, x1, y1, x2, y2);
        }
        System.out.println(list.size());
    }

    private static List<List<Integer>> add2List(List<List<Integer>> list, int x1, int y1, int x2, int y2) {
        for (int i = 0; i < x2 - x1; i++) {
            for (int j = 0; j < y2 - y1; j++) {
                List<Integer> l = new ArrayList<>();
                l.add(x1 + i);
                l.add(y1 + j);
                if (!list.contains(l)) {
                    list.add(l);
                }
            }
        }
        return list;
    }

}


