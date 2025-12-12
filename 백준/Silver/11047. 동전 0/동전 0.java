import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        int count = 0; 
        int idx = A.length - 1; 
        while (idx >= 0) {
            if (K == 0) {
                break; 
            }
            count += K / A[idx]; 
            K %= A[idx];
            idx--;
        }

        System.out.println(count);
    }
}