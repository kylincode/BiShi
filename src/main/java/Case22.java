import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by kylin on 2017/9/4.
 */
public class Case22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int r = scanner.nextInt();
            int avg = scanner.nextInt();
            ArrayList<Node> nodes = new ArrayList<>();
            int basic = 0;
            for(int i = 0; i<n; i++){
                int v = scanner.nextInt();
                int k = scanner.nextInt();
                Node node = new Node(k,v);
                nodes.add(node);
                basic += v;
            }

            int needed = avg * n - basic;
            long time = 0;
            Comparator<Node> comparator = new Comparator<Node>() {
                @Override
                public int compare(Node o1, Node o2) {
                    return o1.k-o2.k;
                }
            };

            Collections.sort(nodes,comparator);

            for (Node tmp : nodes) {
                int key = tmp.k;
                int value = tmp.v;
                if(needed > 0){
                    int tmpV = r - value;
                    if(needed >= tmpV){
                        time += tmpV * key;
                        needed -= tmpV;
                    }else{
                        time += needed * key;
                        break;
                    }
                }
            }
            System.out.println(time);
        }
    }

    static class Node{
        int k;
        int v;

        public Node(int k, int v) {
            this.k = k;
            this.v = v;
        }
    }
}
