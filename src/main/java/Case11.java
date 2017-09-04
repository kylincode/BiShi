import java.util.Scanner;

/**
 * Created by kylin on 2017/9/3.
 */
public class Case11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            int[] xArr = new int[num];
            for(int i = 0; i<num; i++){
                xArr[i] = scanner.nextInt();
            }

            int[] yArr = new int[num];
            for(int i = 0; i<num; i++){
                yArr[i] = scanner.nextInt();
            }

            int min = Integer.MAX_VALUE;
            int minIndex = 0;

            for(int i = 0; i<num; i++){
                int distance = Math.abs(xArr[i]-1) * Math.abs(xArr[i]-1)+Math.abs(yArr[i]-1) * Math.abs(yArr[i]-1);
                if(distance < min){
                    min = distance;
                    minIndex = i;
                }
            }

            System.out.println( Math.abs(xArr[minIndex]-1)+ Math.abs(yArr[minIndex]-1));
        }
    }


}
