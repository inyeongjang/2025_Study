import java.util.*; 
import java.io.*; 

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int prev = Integer.parseInt(st.nextToken()); 
        boolean asc = true; 
        boolean dsc = true; 
        
        for (int i = 1; i < 8; i++) {
            int curr = Integer.parseInt(st.nextToken()); 
            if (curr != prev + 1) asc = false; 
            if (curr != prev - 1) dsc = false; 
            prev = curr; 
        } 
        
        if (asc == true) System.out.println("ascending"); 
        else if (dsc == true) System.out.println("descending"); 
        else System.out.println("mixed"); 
    }
}