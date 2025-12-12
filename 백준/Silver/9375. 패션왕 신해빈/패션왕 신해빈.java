import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            // 의상 종류별 개수를 저장할 Map 
            Map<String, Integer> clothes = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            
            for (int j = 0; j < n; j++) {
                String[] s = br.readLine().split(" ");
                String name = s[0];
                String type = s[1]; 
                // Map에서 type 키의 값을 가져오되, 존재하지 않으면 기본값 0을 반환
                // 해당 종류의 의상 개수 증가
                clothes.put(type, clothes.getOrDefault(type, 0) + 1);
            }

            int result = 1;

            // 모든 종류에 대해 곱해 전체 조합 구하기 
            for (int count : clothes.values()) {
                result *= (count + 1); 
            }

            // 아무것도 안 입는 경우 제외 
            System.out.println(result - 1);
        }
    }
}