package 跳一跳_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp;
        int score = 0;
        int tag = 0;
        while(true){
            temp=in.nextInt();
            if(temp==0){
                break;
            }else if(temp==1){
                tag = 0;
                score = score+temp;
            }else if(temp==2){
                tag++;
                score = score+tag*temp;
            }
        }
        System.out.println(score);
    }
}
