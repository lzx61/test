package 报数_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] person = new int[4];
        int sum = 0;
        int tag = 0;
        for(int i = 1;;i++){
            String s = i+"";
            while((i%7==0)
                    ||judgeI(i)){
                i++;
                person[tag]++;
                if(tag==3)
                    tag=0;
                else
                    tag++;
            }
            sum++;
            if(tag==3)
                tag=0;
            else
                tag++;
            if(sum==n)
                break;
        }
        for(int i=0;i<4;i++){
            System.out.println(person[i]);
        }
    }
    public static boolean judgeI(int i){

        String s = String.valueOf(i);
        char[] c = s.toCharArray();
        for(char ch : c){
            if(ch=='7')
                return true;
        }
        return false;
    }
}
