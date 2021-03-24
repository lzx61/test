package ISBN_2;

import java.util.Scanner;

import static java.lang.Character.getNumericValue;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char[] c = s.toCharArray();

        int num = (getNumericValue(c[0]) + 2 * getNumericValue(c[2]) + 3 * getNumericValue(c[3]) + 4 * getNumericValue(c[4]) + 5 * getNumericValue(c[6]) + 6 * getNumericValue(c[7]) + 7 * getNumericValue(c[8]) + 8 * getNumericValue(c[9]) + 9 * getNumericValue(c[10])) % 11;
        if (num == 10) {
            if ('X' == c[12]) {
                System.out.println("Right");
            } else {
                c[12] = 'X';
                System.out.println(String.valueOf(c));
            }
        } else {
            if (num == getNumericValue(c[12])) {
                System.out.println("Right");
            } else {
                c[12] = (char) (num + 48);
                System.out.println(String.valueOf(c));
            }
        }

    }
}


