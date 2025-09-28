import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());  
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashSet<String> notHeard = new HashSet<>(); 
		ArrayList <String> both = new ArrayList<>();
				
		for(int i = 0; i < N; i++) {
			notHeard.add(br.readLine());
		} 
		
		for(int j = 0; j < M; j++) {
			String s = br.readLine(); 
			if(notHeard.contains(s)) {
				both.add(s); 
			}
		}
		
		Collections.sort(both); 
        
		System.out.println(both.size());
		for(String s : both) {
			System.out.println(s);
		}
	}
}