import java.io.*; 
import java.util.*; 

public class Main {
		public static void main(String[] args) throws Exception {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
				StringTokenizer st = new StringTokenizer(br.readLine()); 
				int N = Integer.parseInt(st.nextToken()); 
				int K = Integer.parseInt(st.nextToken()); 
				
				// N! / K! * (N - K)!
				int A = 1; 
				int B = 1; 
				int C = 1; 
				for (int i = N; i > 0; i--) A *= i; 
				for (int j = K; j > 0; j--) B *= j; 
				for (int h = (N - K); h > 0; h--) C *= h; 
				
				System.out.println(A/(B*C));
		} 
}