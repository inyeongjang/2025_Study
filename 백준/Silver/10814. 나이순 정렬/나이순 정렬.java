import java.util.*; 
import java.io.*; 

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 

        int N = Integer.parseInt(br.readLine().trim()); 
        
        /*
         * trim() : 문자열 앞뒤 공백 제거 
         * 
         * Map.Entry<Integer, String> : Map의 한 쌍(key, value)을 표현하는 인터페이스 
         * ㄴ getKey() : 키 반환 
         * ㄴ getValue() : 값 반환 
         * ㄴ comparingByKey() : Entry의 key 기준 Comparator  
         * 
         * Stringtokenizer : 문자열을 특정 구분자로 잘라주는 클래스 
         * ㄴ nextToken() : 다음 토큰을 꺼내옴 
         * 
         * StringBuilder : 문자열 여러 줄을 합쳐 한 번에 출력 
         * ㄴ toString() : 누적한 문자열을 한 번에 꺼냄 
         *  
         * AbstractMap.SimpleEntry<K, V> : (key,value) 한 쌍을 간단히 담는 구현체 
         */

        List<Map.Entry<Integer, String>> list = new ArrayList<>(); 
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int key = Integer.parseInt(st.nextToken()); 
            String value = st.nextToken(); 
            list.add(new AbstractMap.SimpleEntry<>(key, value)); 
        }

        list.sort(Map.Entry.comparingByKey());

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, String> e : list) {
            sb.append(e.getKey()).append(' ').append(e.getValue()).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
    } 
}