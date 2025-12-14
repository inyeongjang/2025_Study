import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(P); 
        
        int sum = P[0]; 
        for (int i = 1; i < N; i++) {
            for (int j = i; j >= 0; j--) {
                sum += P[j];
            }
        }

        System.out.println(sum);
    }
}