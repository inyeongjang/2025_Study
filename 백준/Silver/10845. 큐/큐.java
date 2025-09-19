import java.util.*; 
import java.io.*; 

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int [] q =  new int[N];
        int head = 0; 
        int tail = 0;
        
        for (int i = 0; i < N; i++) {
            String s = br.readLine().trim();
            char c = s.charAt(0); 
            
            if (c == 'p') {
                if (s.charAt(1) == 'u') 
                    q[tail++] = Integer.parseInt(s.substring(5)); 
		            else 
				            System.out.println(head == tail ? -1 : q[head++]);
            } 
            else if (c == 's') {
                System.out.println(tail - head); 
            } 
            else if (c == 'e') {
                System.out.println(head == tail ? 1 : 0); 
            } 
            else if (c == 'f') {
                System.out.println(head == tail ? -1 : q[head]); 
            } 
            else {
                System.out.println(head == tail ? -1 : q[tail - 1]); 
            }
        }
    } 
} 