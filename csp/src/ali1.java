import java.util.Scanner;

public class ali1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i = 0;i<T;i++){
            System.out.println(get(scan.nextInt()));
        }
    }

    public static int get(int n){
        int mod = 1000000007;
        long ans = 0;
        if(n==1){
            return 12;
        }
        long f0 = 6;
        long f1 = 6;
        for(int i = 2;i<=n;i++){
            long tf0 = 2*f0+2*f1;
            long tf1 = 2*f0+3*f1;
            f0=tf0%mod;
            f1=tf1%mod;
        }
        ans = f0+f1;
        return (int)ans%mod;
    }
}
