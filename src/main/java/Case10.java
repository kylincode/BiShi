import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kylin on 2017/9/3.
 * 幸运的袋子
 */
public class Case10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            int[] nums = new int[num];
            for(int i = 0; i < num; i++){
                nums[i] = scanner.nextInt();
            }
            Arrays.sort(nums);
            int count = DFS(0,nums,0,1);
            System.out.println(count);
        }
    }

    public static int DFS(int index,int[] nums,int sum, int muplti){
        int count = 0;
        for(int i = index; i < nums.length; i++){
            sum += nums[i];
            muplti *= nums[i];
            if(sum > muplti){
                count += 1+ DFS(i+1,nums,sum,muplti);
            }else if(nums[i] == 1){
                count += DFS(i+1,nums,sum,muplti);
            }else{
                break;
            }
            sum -= nums[i];
            muplti /= nums[i];
            while(i < nums.length-1 && nums[i] == nums[i+1]){
                i++;
            }
        }
        return count;
    }

}
