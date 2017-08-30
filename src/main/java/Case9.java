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
            int[] cpu = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                cpu[i] = sc.nextInt() / 1024;
                sum += cpu[i];
            }
            int sumhalf = sum / 2;
            int[] time = new int[sumhalf + 1];
            for (int i = 0; i < cpu.length; i++) {
                for (int j = sumhalf; j >= 0; j--) {
                    if (j >= cpu[i]) time[j] = Math.max(time[j], time[j - cpu[i]] + cpu[i]);
                }
            }
            System.out.println(Math.max(time[sumhalf], sum - time[sumhalf]) * 1024);
        }
    }
}
