/**
 * Created by kylin on 2017/9/4.
 */
public class Case23 {
    public static void main(String[] args) {

    }
    public int getMost(int[][] board) {
        // write code here
        int[][] dp = new int[7][7];
        for(int i = 1; i<=6;i++){
            for(int j = 1; j<=6;j++){
                if(i == 0){
                    dp[i][j] =  dp[i][j-1]+board[i-1][j-1];
                }else if(j == 0){
                    dp[i][j] =  dp[i-1][j]+board[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1])+board[i-1][j-1];
                }
            }
        }
        return dp[6][6];
    }
}
