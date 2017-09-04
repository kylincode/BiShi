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

            long tmp = 0;
            for(int i = 0; i<c; i++){
                tmp += arr[i];
            }

            int count = 0;
            if(tmp <= t){
                count++;
            }

            for(int  i = c; i<n; i++){
                tmp -= arr[i-c];
                tmp += arr[i];
                if(tmp <= t){
                    count++;
                }
            }

            System.out.println(count);
        }
    }


}
