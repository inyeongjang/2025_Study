import java.util.*; 
import java.io.*; 

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder(); 
        
        int N = Integer.parseInt(br.readLine());
        int [] stack = new int[N]; 
        int top = -1; 
        
        for (int i = 0; i < N; i++) {
		        String s = br.readLine();
		        char c = s.charAt(0);
		        
            if (c == 'p') {
                if (s.charAt(1) == 'u') {
	                stack[++top] = Integer.parseInt(s.substring(5)); 
                } 
                else {
	                System.out.println(top == -1 ? -1 : stack[top--]); 
                } 
            } 
            
            else if (c == 's') {
                System.out.println(top + 1); 
            } 
            
            else if (c == 'e') {
                System.out.println(top == -1 ? 1 : 0); 
            } 
            
            else if (c == 't') {
		        System.out.println(top == -1 ? -1 : stack[top]);  
            }  
        } 
    }
} 