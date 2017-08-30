import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Author: kylin
 * Date: 2017/8/28
 * 操作序列.
 */
public class Case3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            for(int i = 0; i < num; i++){
                int tmpInt = scanner.nextInt();
                arrayList.add(tmpInt);
                Collections.reverse(arrayList);
            }
            StringBuilder stringBuilder = new StringBuilder();
            for(int i : arrayList){
                stringBuilder.append(i);
                stringBuilder.append(" ");
            }
            System.out.println(stringBuilder.toString().trim());
        }
    }

}
