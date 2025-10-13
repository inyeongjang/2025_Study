import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());
        for (int tc = 0; tc < T; tc++) {
            int k = Integer.parseInt(br.readLine().trim());
            int n = Integer.parseInt(br.readLine().trim());

            int[] arr = new int[n + 1];
            for (int i = 1; i <= n; i++) arr[i] = i;

            for (int floor = 1; floor <= k; floor++) {
                for (int i = 1; i <= n; i++) {
                    arr[i] += arr[i - 1];
                }
            }

            sb.append(arr[n]).append('\n');
        }

        System.out.print(sb.toString());
    }
}
