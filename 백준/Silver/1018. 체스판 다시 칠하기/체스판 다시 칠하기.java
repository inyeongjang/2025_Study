import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken()); 
        int n = Integer.parseInt(st.nextToken());

        char[][] board = new char[m][n];

        for (int i = 0; i < m; i++) {
            String line = br.readLine().trim();
            for (int j = 0; j < n; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int answer = Integer.MAX_VALUE;

        for (int i = 0; i <= m - 8; i++) {
            for (int j = 0; j <= n - 8; j++) {

                int repaintB = 0; 
                int repaintW = 0;

                for (int x = i; x < i + 8; x++) {
                    for (int y = j; y < j + 8; y++) {
                        char current = board[x][y];

                        if ((x + y) % 2 == 0) {
                            if (current != 'B') repaintB++;
                            if (current != 'W') repaintW++;
                        } else {
                            if (current != 'W') repaintB++;
                            if (current != 'B') repaintW++;
                        }
                    }
                }

                int localMin = Math.min(repaintB, repaintW);
                answer = Math.min(answer, localMin);
            }
        }
        System.out.println(answer);
    }
}
