import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); 
        
        if (N == 0) {
            System.out.println(0);
            return;
        }
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        
        Collections.sort(list);
        
        int number = (int) Math.round(N * 0.15);
        int sum = 0;
        int cnt = 0;
        for (int j = number; j < N - number; j++){
            sum += list.get(j);
            cnt++;
        }

        System.out.println(Math.round((double)sum / cnt));
    }
}