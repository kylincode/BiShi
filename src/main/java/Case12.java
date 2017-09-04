import java.util.Scanner;

/**
 * Created by kylin on 2017/9/3.
 */
public class Case12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String A = scanner.nextLine();
            String B = scanner.nextLine();
            int result = 0;
            for (int i = 0; i <= A.length(); i++) {
                StringBuilder stringBuilder = new StringBuilder(A);
                String tmp = stringBuilder.insert(i, B).toString();
                if (isRight(tmp)) result++;
            }
            System.out.println(result);
        }
    }

    public static boolean isRight(String A){
        StringBuilder stringBuilder = new StringBuilder(A);
        String tmpA = stringBuilder.reverse().toString();
        return tmpA.equals(A);
    }
}
