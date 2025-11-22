import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 0) {
            System.out.println(0);
            return;
        }

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int cut = (int) Math.round(N * 0.15);  
        long sum = 0; 

        for (int i = cut; i < N - cut; i++) {
            sum += arr[i];
        }

        int count = N - 2 * cut;
        long result = Math.round((double) sum / count);

        System.out.println(result);
    }
}
