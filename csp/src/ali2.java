import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ali2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String str = scan.nextLine();
        int[] dp = new int[n];
        Arrays.fill(dp,str.length());
        char left = str.charAt(0);
        char right = str.charAt(str.length()-1);
        for(int i = 1;i<n;i++){
            String s = scan.nextLine();
            if(s.charAt(s.length()-1)<=left){
                dp[i]=s.length()+dp[i-1];
                left = s.charAt(0);
            }else if(s.charAt(0)>=right){

                dp[i]=s.length()+dp[i-1];
                right = s.charAt(s.length()-1);
            }else{
                if(dp[i-1]>s.length()){
                    dp[i]=dp[i-1];
                }else{
                    dp[i]=s.length();
                    left = s.charAt(0);
                    right = s.charAt(s.length()-1);

                }
            }
            System.out.println(left+"~"+right);
            System.out.println(dp[i]);
        }
    }
}
