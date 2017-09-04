import java.util.Scanner;

/**
 * Created by kylin on 2017/9/3.
 */
public class Case15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int N = scanner.nextInt();
            int n1 = 0;
            int n2 = 1;
            int fibonacci = n1 + n2;
            while(fibonacci < N){
                n1 = n2;
                n2 = fibonacci;
                fibonacci = n1 + n2;
            }

            int result = 0;
            if(fibonacci > N){
                result = Math.min(fibonacci - N,N - n2);
            }
            System.out.println(result);
        }
    }
}
