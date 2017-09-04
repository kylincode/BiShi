/**
 * Author: kylin
 * Date: 2017/8/30
 * 双核处理.(转换为0-1背包问题)
 */


import java.util.*;

public class Case9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] cpu = new int[n+1];
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                cpu[i] = sc.nextInt() / 1024;
                sum += cpu[i];
            }
            int sumhalf = sum / 2;
            int[][] time = new int[n+1][sumhalf + 1];
            for (int i = 1; i < cpu.length; i++) {
                /*for (int j = sumhalf; j >= 0; j--) {
                    if (j >= cpu[i]) time[j] = Math.max(time[j], time[j - cpu[i]] + cpu[i]);
                }*/

                for (int j = cpu[i]; j <= sumhalf; j++) {
                    time[i][j] = Math.max(time[i-1][j], time[i-1][j - cpu[i]] + cpu[i]);
                }
            }
            System.out.println(time[n][sumhalf]);
            System.out.println(Math.max(time[n][sumhalf], sum - time[n][sumhalf]) * 1024);
        }
    }
}
