import java.util.Scanner;

/**
 * Created by kylin on 2017/9/4.
 */
public class Case21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N =  scanner.nextInt();
        int[] power = new int[N+1];
        for(int i = 1; i<=N;i++){
            power[i] = scanner.nextInt();
        }

        int K = scanner.nextInt();
        int D = scanner.nextInt();

        int[][] dpmin = new int[N+1][K+1];
        int[][] dpmax = new int[N+1][K+1];
        int res = Integer.MIN_VALUE;
        for(int i = 1; i<=N;i++){
            dpmax[i][1] = power[i];
            dpmin[i][1] = power[i];
            for(int k = 2; k <=K; k++){
                for(int j = i -1; j > 0 && i - j <= D; j--){
                    dpmax[i][k] = Math.max(dpmax[i][k],Math.max(dpmax[j][k-1] * power[i],dpmin[j][k-1] * power[i]));
                    dpmin[i][k] = Math.min(dpmax[i][k],Math.min(dpmax[j][k-1] * power[i],dpmin[j][k-1] * power[i]));
                }
            }
            res = Math.max(res,dpmax[i][K]);
        }
        System.out.println(res);
    }
}
