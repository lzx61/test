package 小中大_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scan.nextInt();
        }
        System.out.print((nums[n-1]>nums[0]?nums[n-1]:nums[0])+" ");
        if(n%2==0){
            double b = ((double)nums[n/2]+(double)nums[n/2-1])/2;
            if(b%1==0.5){
                System.out.print(b+" ");
            }else{
                System.out.print((int)b+" ");
            }
        }else{
            int b=nums[n/2];
            System.out.print(b+" ");
        }
        System.out.print((nums[n-1]<nums[0]?nums[n-1]:nums[0]));
    }
}
