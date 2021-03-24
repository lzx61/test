package 魔数_5;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        BigInteger u1 = new BigInteger("427197303358170108");
        BigInteger t = new BigInteger("2009731336725594113");
        BigInteger t2 = new BigInteger("2009");
        BigInteger s = new BigInteger("1").multiply(u1).remainder(t).remainder(t2).add(
                new BigInteger("2").multiply(u1).remainder(t).remainder(t2).add(
                        new BigInteger("3").multiply(u1).remainder(t).remainder(t2)))
               ;
        System.out.println(s);
    }
}
