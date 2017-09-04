import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by kylin on 2017/9/3.
 */
public class Case14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String tmp = scanner.next();
            char[] arr = tmp.toCharArray();
            Set<Character> characterSet = new HashSet<>();
            boolean updateCase = true;
            boolean result  = true;
            for(char tmpChar : arr){
                if(!Character.isUpperCase(tmpChar)){
                    updateCase = false;
                    break;
                }
                characterSet.add(tmpChar);
            }
            if(updateCase){
                ArrayList<Character> arr2 = new ArrayList<>(characterSet);
                for(int i = 0; i<arr2.size(); i++){
                    char c1 = arr2.get(i);
                    String tmp2 = String.valueOf(c1)+ String.valueOf(c1)+"";
                    if(tmp.contains(tmp2)){
                        result = false;
                    }
                    if(result) {
                        for (int j = i + 1; j < arr2.size(); j++) {
                            char c2 = arr2.get(j);
                         tmp2=c1 + c2 + c1 + c2 + "";
                            if (tmp.contains(tmp2)) {
                                result = false;
                            }
                        }
                    }
                }
                if(result){
                    System.out.println("Likes");
                }else{
                    System.out.println("Dislikes");
                }
            }else{
                System.out.println("Dislikes");
            }

        }

    }
}
