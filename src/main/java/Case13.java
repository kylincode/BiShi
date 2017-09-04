import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kylin on 2017/9/3.
 */
public class Case13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        ArrayList<String> arrayList = new ArrayList<String>();
        for(int i = 0; i<num; i++){
            arrayList.add(scanner.next());
        }

        boolean result1 = true;
        boolean result2 = true;
        for(int i = 0; i < arrayList.size()-1; i++){
            String tmp1 = arrayList.get(i);
            String tmp2 = arrayList.get(i+1);
            if(tmp1.compareTo(tmp2) > 0){
                result1 = false;
            }
            if(tmp1.length() > tmp2.length()){
                result2 = false;
            }

        }

        if(result1 && !result2){
            System.out.println("lexicographically");
        }else if(!result1 && result2){
            System.out.println("lengths");
        }else if(result1 && result2){
            System.out.println("both");
        }else{
            System.out.println("none");
        }
    }
}
