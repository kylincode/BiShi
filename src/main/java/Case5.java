import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Author: kylin
 * Date: 2017/8/30
 * 堆棋子.
 */
public class Case5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = Integer.parseInt(scanner.nextLine());
            int[] xArr = new int[num];
            int[] yArr = new int[num];
            String[] tmp1 = scanner.nextLine().split(" ");
            String[] tmp2 = scanner.nextLine().split(" ");

            for(int i = 0; i < num; i++){
                xArr[i] = Integer.parseInt(tmp1[i]);
                yArr[i] = Integer.parseInt(tmp2[i]);
            }

            StringBuilder stringBuilder = new StringBuilder();
            //枚举
            for(int i = 1; i <= num; i++){
                int min = Integer.MAX_VALUE;
                for(int row = 0; row < num; row++){
                    for(int col = 0; col < num; col++){
                       int x = xArr[row];
                       int y = yArr[col];
                        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(i, new Comparator<Integer>() {
                            @Override
                            public int compare(Integer o1, Integer o2) {
                                return o2-o1;
                            }
                        });
                       int sum = 0;
                       for(int k = 0; k < num; k++){
                            int disance = Math.abs(x-xArr[k])+Math.abs(y-yArr[k]);
                            sum += disance;
                            priorityQueue.add(disance);
                            if(priorityQueue.size() > i){
                                sum -= priorityQueue.poll();
                            }

                       }
                       min = Math.min(sum,min);
                    }
                }
                stringBuilder.append(min);
                stringBuilder.append(" ");
            }
            System.out.println(stringBuilder.toString().trim());
        }
    }

}
