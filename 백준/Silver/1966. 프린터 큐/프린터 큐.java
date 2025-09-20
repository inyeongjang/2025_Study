import java.util.*; 
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder();
        
        int cases = Integer.parseInt(br.readLine()); 
        for (int i = 0; i < cases; i++) { 
            StringTokenizer st = new StringTokenizer(br.readLine()); 
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
              
            /* 
             * ArrayDeque : Java에서 제공하는 Queue 구현체 
             * ㄴ q.poll() : 맨 앞 원소 꺼내기 (없으면 null)
             * ㄴ q.add(x) : 맨 뒤에 삽입 
             * ㄴ 시간복잡도 O(1), LinkedList보다 빠르고 가벼움 
             */
              
            ArrayDeque<int[]> q = new ArrayDeque<>(); 
            int[] freq = new int[10];                      // 중요도 빈도 배열 
            
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int p = Integer.parseInt(st.nextToken()); 
                q.add(new int[]{p, j});                    // {중요도 p, 위치 j} 저장 
                freq[p]++;                                 // 중요도 개수 증가  
            }
            
            // 현재 큐 안에서 가장 높은 중요도 (max) 찾기 
            int max = 9;
            while (max > 0 && freq[max] == 0) max--;

            int printed = 0;                               // 출력 순서 
            
            while (true) {
                int[] cur = q.poll();                      // 맨 앞 문서 
                int p = cur[0];                            // 중요도 
                int idx = cur[1];                          // 위치 
                                
                // 중요도가 최댓값이면 출력 
                if (p == max) {  
                    printed++;                              // 출력 순서 증가 
                    // 현재 중요도가 소진되었으면, 다음으로 큰 중요도로 이동 
                    if (--freq[p] == 0) {
                        while (max > 0 && freq[max] == 0) max--;
                    }
                    // 찾던 문서라면 출력 순서 기록 후 반복 종료 
                    if (idx == M) {    
                        sb.append(printed).append('\n');
                        break;
                    }
                // 더 큰 중요도가 남아 있으면 뒤로 보냄 
                } else {
                    q.add(cur);
                }
            }
        }
        // 결과 한번에 출력 
        System.out.print(sb.toString());
    }
}
