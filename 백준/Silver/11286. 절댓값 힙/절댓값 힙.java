import java.util.*;
import java.lang.*;
import java.io.*;

public class Main  {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Comparator<Integer> comp = new Comparator<Integer>() {
            // compare(a, b)가 음수면 a가 부모, compare(a, b)가 양수면 b가 부모 
            public int compare(Integer a, Integer b) {
                int absA = Math.abs(a);
                int absB = Math.abs(b); 
                // 절댓값이 다르면 절댓값 작은 것 우선 
                if (absA != absB) {
                    return absA - absB; 
                }
                // 절댓값이 같으면 실제 값이 작은 것 우선
                return a - b;
            }
        };
        
        int x = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(comp);
        
        for (int i = 0; i < N; i++) {
            x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (pq.isEmpty()) {
                    System.out.println(0);
                }
                else {
                    System.out.println(pq.poll());               
                }
            }     
            else {
                pq.offer(x);
            }
        }
    }
}