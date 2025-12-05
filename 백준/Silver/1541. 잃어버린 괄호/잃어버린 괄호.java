import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

        // '-' 기준으로 문자열을 분리한다.
        String[] minusSplit = br.readLine().split("-");

        int result = 0; 

        // 첫 번째 그룹은 그대로 더한다. 
        result += sumOfGroup(minusSplit[0]);
        
        // 두 번째 그룹부터는 모두 더한 뒤 한 번에 빼준다.
        for (int i = 1; i < minusSplit.length; i++) {
            result -= sumOfGroup(minusSplit[i]);
        } 

        System.out.println(result); 
    }

    private static int sumOfGroup(String s) {
        // '+'는 정규식 메타문자이므로 "\\+"로 이스케이프해야 split 가능
        String[] nums = s.split("\\+");
        
        int sum = 0;  
        
        for (String num : nums) {
            sum += Integer.parseInt(num);
        }
        
        return sum; 
    }
}