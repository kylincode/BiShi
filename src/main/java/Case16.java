import java.util.*;

/**
 * Created by kylin on 2017/9/3.
 */
public class Case16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            int[] arr = new int[num];
            for(int i = 0; i < num; i++){
                arr[i] = scanner.nextInt();
            }
            Set<Integer> set  = new HashSet<>();
            DFS(arr,0,0,set);
            List<Integer>  arrayList = new ArrayList<Integer>(set);
            Collections.sort(arrayList);
            int min = arrayList.get(arrayList.size()-1)+1;
            for(int i = 0; i<arrayList.size() - 1; i++){
                if(arrayList.get(i+1)-arrayList.get(i) > 1){
                    min = arrayList.get(i)+1;
                    break;
                }
            }
            if(arrayList.get(0) > 1){
                System.out.println(1);
            }else{
                System.out.println(min);
            }

        }
    }

    public static void DFS(int[] arr,int index,int sum,Set<Integer> set){
        for(int i = index; i < arr.length; i++){
            sum+= arr[i];
            set.add(sum);
            DFS(arr,i+1,sum,set);
            sum-= arr[i];
        }
    }
}
