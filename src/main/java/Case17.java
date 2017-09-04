import java.util.Scanner;

/**
 * Created by kylin on 2017/9/3.
 */
public class Case17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            int[] arr = new int[num];
            for(int i = 0; i<num; i++){
                arr[i] = scanner.nextInt();
            }
            int K = scanner.nextInt();
            int d = scanner.nextInt();
            int[][] fmax = new int[num+1][num+1];
            int[][] fmin = new int[num+1][num+1];
            int res = Integer.MIN_VALUE;
            for(int i = 0; i <= num; i++){
                fmax[1][i] = arr[i];
                fmin[1][i] = arr[i];
                for (int k = 2; k <=K; k++) {
                    for(int j = i-1; j > 0 && i - j < d; j--){
                        fmax[k][i] = Math.max(fmax[k][i-1],Math.max(fmax[k-1][i-1]*arr[i],fmin[k-1][i-1]*arr[i]));
                    }
                }
                res = Math.max(res,fmax[K][i]);
            }
            System.out.println(res);
        }
    }
}
