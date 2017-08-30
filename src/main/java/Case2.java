import java.util.Scanner;

/**
 * Author: kylin
 * Date: 2017/8/28
 * 交错01串.
 */
public class Case2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String line = scanner.next();
            if(line.length() == 0){
                System.out.println(0);
                break;
            }
            char[] arr = line.toCharArray();
            int len = line.length();
            int maxLen = 0;
            for(int i = 0; i < len; i++){
                int tmpLen = 1;
                for(int j = i; j < len - 1; j++){
                    if(arr[j] != arr[j+1]){
                        tmpLen++;
                    }else{
                        break;
                    }
                }
                if(tmpLen > maxLen){
                    maxLen = tmpLen;
                }
            }
            System.out.println(maxLen);
        }
    }
}
