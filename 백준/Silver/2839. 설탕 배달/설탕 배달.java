import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        
        if (N == 3) {
            System.out.println(1);
        } 
        else if (N == 4) {
            System.out.println(-1);
        }
        else if (N % 5 == 0) {
            System.out.println(N / 5);
        }
        else {
            int num = N / 5; 
            for (int i = num; i > 0; i--) {
                if ((N - 5 * i) % 3 == 0) {
                    System.out.println(i + (N - 5 * i) / 3);
                    return; 
                }
            }
            if (N % 3 == 0) {
                System.out.println(N / 3);
            }
            else {
                System.out.println(-1);
            }
        }
    }
}