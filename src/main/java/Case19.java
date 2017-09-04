import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kylin on 2017/9/3.
 */
public class Case19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str1 = scanner.next();
            char[] str2 = scanner.next().toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            for(char tmp : str2){
                stringBuilder.append(".*");
                stringBuilder.append(new String().valueOf(tmp));
            }
            stringBuilder.append(".*");

            Pattern pattern = Pattern.compile(stringBuilder.toString());
            Matcher matcher = pattern.matcher(str1);
            if(matcher.find()){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
