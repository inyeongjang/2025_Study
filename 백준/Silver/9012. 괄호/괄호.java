import java.io.*; 
import java.util.*; 
 
public class Main {
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in); 
				int T = Integer.parseInt(sc.nextLine()); 
				
				for (int i = 0; i < T; i++) {
					String vps = sc.nextLine(); 
					char[] stack = new char[vps.length()]; 
					int top = -1;
					
					boolean ok = true; 
					for (char c : vps.toCharArray()) { 
						if (c == '(') {stack[++top] = c;} // push
						else if (c == ')') {
								if (top == -1) {ok = false; break;}  		
								else {top--;} // pop 
						}
					} 
					
					if (ok == true && top == -1) System.out.println("YES");
					else System.out.println("NO"); 
				} 
		} 
}