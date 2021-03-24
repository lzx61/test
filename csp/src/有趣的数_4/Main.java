package 有趣的数_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int[] c = new int[n];
        c[0]=2;
        count = gen(c,1,count);


        System.out.println(count);
    }

    private static int gen(int[] c, int i, int count) {
        if(i==c.length){
            if(judge(c)){
                System.out.println();
                for (int c1 : c) {
                    System.out.print(c1 + " ");
                }
                count++;
                if(count==1000000007){
                    count = 0;
                }
            }
        }else{
        for(int j = 0;j<4;j++){
            c[i]=j;
            count = gen(c,i+1,count);
        }}
        return count;
    }

    public static boolean judge(int[] c){
        int tagf = 0;
        int tag0 = 0;
        int tag1 = 0;
        int tag2 = 0;
        int tag3 = 0;
        for (int c1 : c) {
            switch (c1) {
                case 0:
                    tag0=1;
                    if (tag1 == 1) {
                        tagf = 1;
                    }
                    break;
                case 1:
                    tag1 = 1;
                    break;
                case 2:
                    tag2=1;
                    if (tag3 == 1) {
                        tagf = 1;
                    }
                    break;
                case 3:
                    tag3 = 1;
                    break;
                default:
                    tagf = 1;
            }
            if (tagf == 1) {
                break;
            }
        }
        if (tagf == 0&&tag0*tag1*tag2*tag3==1) {
            return true;
        }
        return false;
    }

}
