import java.util.Scanner;

/**
 * Created by kylin on 2017/9/4.
 */
public class Case24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int t = scanner.nextInt();
            int c = scanner.nextInt();
            int[] arr = new int[n+1];
            for(int i = 1; i<=n; i++){
                arr[i] = scanner.nextInt();
            }
            long[] dp = new long[t+1];
            dp[c] = 1;
            for(int i = c+1; i<=n; i++){
                for(int j = arr[i]; j<=t; j++){
                    dp[j] = dp[j-arr[i]]+(calcaute(i-1)/(calcaute(c-1)*calcaute(i-c)));
                }
            }
            System.out.println(dp[t]);
        }
    }
    public static long calcaute(int n){
        long result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        System.out.println("result:"+result);
        return result;
    }

}
