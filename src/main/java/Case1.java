import java.util.HashMap;
import java.util.Scanner;

/**
 * Author: kylin
 * Date: 2017/8/28
 * 彩色砖块.
 */
public class Case1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int reuslt = 0;
            HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
            String line = scanner.nextLine();
            char[] array = line.toCharArray();
            for(char tmp : array){
                Integer tmpInt = 0;
                if(hashMap.containsKey(tmp)){
                    tmpInt = hashMap.get(tmp);
                    tmpInt = tmpInt + 1;
                }
                hashMap.put(tmp,tmpInt);
            }
            if(hashMap.size() > 3){
                reuslt = 0;
            }else {
                reuslt = hashMap.size();
            }
            System.out.println(reuslt);
        }
    }
}
