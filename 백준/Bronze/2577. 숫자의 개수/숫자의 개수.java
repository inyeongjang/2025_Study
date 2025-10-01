import java.io.*; 
import java.util.*;

public class  Main {
   public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int A = Integer.parseInt(br.readLine()); 
       int B = Integer.parseInt(br.readLine()); 
       int C = Integer.parseInt(br.readLine()); 
		   
		   int mul = A * B * C; 
		   int [] cnt = new int[10]; 
		   
		   if (mul == 0) {
				   cnt[0] = 1; 
		   } 
		   while (mul != 0) {  
				   cnt[mul % 10]++; 
				   mul /= 10; 
		   } 
		   
		   for (int i = 0; i < 10; i++) {
				   System.out.println(cnt[i]); 
		   }
   }  
} 