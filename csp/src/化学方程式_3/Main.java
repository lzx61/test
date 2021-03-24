package 化学方程式_3;
/*
5
H2+O2=H2O
2H2+O2=2H2O
H2+Cl2=2NaCl
H2+Cl2=2HCl
CH4+2O2=CO2+2H2O
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            if (judge(s)) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }

    private static boolean judge(String s) {
        String[] s1 = s.split("=");
        if (split(s1[0]).equals(split(s1[1]))) {
            return true;
        }
        return false;
    }

    private static Map<String, Integer> split(String s) {
        String[] s1 = s.split("\\+");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length; i++) {
            int xs = 1;
            int xs2 = 0;
            char[] ch = s1[i].toCharArray();
            for (int j = 0; j < ch.length; j++) {
                if (ch[j] >= '0' & ch[j] <= '9') {
                    if (j == 0) {
                        xs = ch[j] - '0';
                    } else {
                        xs = 10 * xs + ch[j] - '0';
                    }
                } else {
                    String st = String.valueOf(ch[j]);
                    for (; j != ch.length - 1 && ch[j + 1] >= 'a' && ch[j + 1] <= 'z'; ) {
                        st = st + ch[j + 1];
                        j++;
                    }
                    for (; j != ch.length - 1 && ch[j + 1] >= '0' && ch[j + 1] <= '9'; ) {
                        xs2 = xs2 * 10 + ch[j + 1] - '0';
                        j++;
                    }
                    if (!(j != ch.length - 1 && ch[j + 1] >= 'a' && ch[j + 1] <= 'z')) {
                        if (xs2 == 0) {
                            if (map.containsKey(st)) {
                                map.put(st, map.get(st) + xs);
                            } else {
                                map.put(st, xs);
                            }
                        } else {
                            if (map.containsKey(st)) {
                                map.put(st, map.get(st) + xs* xs2);
                            } else {
                                map.put(st, xs * xs2);
                            }
                            xs2 = 0;
                        }
                    }
                }
            }
        }
//        System.out.println(map);
        return map;
    }

}
