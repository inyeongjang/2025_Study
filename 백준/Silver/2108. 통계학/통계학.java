import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[N];
        int[] cnt = new int[8001];
        int sum = 0;
        
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine().trim()); 
            sum += arr[i];
            cnt[arr[i] + 4000] ++;
        }

        Arrays.sort(arr);

        int mean = (int) Math.round((double) sum / N);
        
        int median = arr[N / 2];
        
        int max_idx = 0;
        for (int i = 0; i < 8001; i++) {
            if (cnt[i] > cnt[max_idx]) {
                max_idx = i;
            }
        }

        int max_cnt = 0;
        int mode = max_idx - 4000;
        for (int j = 0; j < 8001; j++) {
            if (cnt[j] == cnt[max_idx]) {
                max_cnt++;
                if (max_cnt == 2) {
                    mode = j - 4000;
                    break;
                }
            }
        }

        int range = arr[N - 1] - arr[0];

        sb.append(mean).append('\n');
        sb.append(median).append('\n');
        sb.append(mode).append('\n');
        sb.append(range).append('\n');

        System.out.print(sb.toString());
    }
}