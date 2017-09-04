import java.util.Scanner;

/**
 * Created by kylin on 2017/9/3.
 */
public class Case18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            int[] arr = new int[num];
            int sum = 0;
            for(int i = 0; i<num; i++){
                arr[i] = scanner.nextInt();
                sum += arr[i];
            }

            if(sum % num != 0){
                System.out.println(-1);
            }else{
                int mean = sum / num;
                boolean flag = true;
                int moreValue = 0;
                int lessValue = 0;
                for(int i = 0; i<num;i++){
                    if(Math.abs(arr[i] -mean) == 1 || Math.abs(arr[i] -mean) % 2!= 0 ){
                        flag = false;
                        break;
                    }else{
                        if(arr[i] < mean){
                            lessValue += mean - arr[i];
                        }else{
                            moreValue += arr[i] - mean;
                        }
                    }
                }

                if(flag){
                    if(lessValue != moreValue || lessValue % 2 != 0){
                        System.out.println(-1);
                    }else {
                        System.out.println(lessValue/2);
                    }
                }else{
                    System.out.println(-1);
                }

            }
        }
    }
}
