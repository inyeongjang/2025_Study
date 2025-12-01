import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 1
        int r = (int) Math.sqrt(n); 
        if (r * r == n) {
            System.out.println(1); 
            return; 
        }

        // 2
        for (int i = 1; i <= r; i++) {
            int remain = n - i * i; 
            int s = (int) Math.sqrt(remain);
            if (s * s == remain) {
                System.out.println(2);  
                return; 
            }
        }

        // 3, 4 : n = 4^a * (8b + 7) 꼴이면 4개의 제곱수가 꼭 필요하다.
        while (n % 4 == 0) {
            n /= 4; 
        }
        if (n % 8 == 7) {
            System.out.println(4);
        }
        else {
            System.out.println(3);
        }
        
    }
}