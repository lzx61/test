package 次数最多_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = 0;
        int[]nums = new int[10000];
        for(int i=0;i<n;i++){
            int x=scan.nextInt();
            nums[x]=nums[x]+1;
            if(nums[x]>max){
                max=nums[x];
            }
        }
        for(int i=0;i<10000;i++){
            if(nums[i]==max){
                System.out.println(i);
                return;
            }
        }
    }
}

