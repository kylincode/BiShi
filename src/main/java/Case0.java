import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Author: kylin
 * Date: 2017/8/28
 * 等差数列.
 */
public class Case0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
             int num = scanner.nextInt();
             ArrayList<Integer> arrayList = new ArrayList<Integer>();
             for(int i = 0; i < num; i++){
                 arrayList.add(scanner.nextInt());
             }

            Collections.sort(arrayList);

            int distance = arrayList.get(1)-arrayList.get(0);
            int tmpNum = arrayList.get(0);
            boolean possible = true;
            for(int i = 1; i < arrayList.size(); i++){
                if(!arrayList.get(i).equals(tmpNum+distance*i)){
                    possible = false;
                    break;
                }
            }
            if(possible){
                System.out.println("Possible");
            }else{
                System.out.println("Impossible");
            }

        }
    }
}
