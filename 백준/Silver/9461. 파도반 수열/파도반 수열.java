import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        long[] dp = new long[101]; 
        dp[1] = dp[2] = dp[3] = 1;
        for (int i = 4; i <= 100; i++) {
            dp[i] = dp[i - 2] + dp[i - 3];
        }
        
        for(int j = 0; j < T; j++) {
            int N = Integer.parseInt(br.readLine().trim());
            System.out.println(dp[N]); 
        }
    }
}