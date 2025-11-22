import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); 
        int num = 1; 
        int i = 1; 
        while (true) {
            if (N <= num) {
                System.out.println(i); 
                break;
            }
            num += 6 * i;
            i++;
        }
    }
}