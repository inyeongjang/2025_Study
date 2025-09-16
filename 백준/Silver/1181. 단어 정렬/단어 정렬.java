import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        int N = sc.nextInt(); 
        sc.nextLine(); 
    
        Set<String> words = new TreeSet<>(
            Comparator.comparingInt(String::length)
                .thenComparing(Comparator.naturalOrder())
        ); 

        /* [직접 구현]  
         *
         * class MyComparator implements Comparator<String> {
         *     @Override
         *     public int compare(String a, String b) {
         *         if (a.length() != b.length()) {
         *             return a.length() - b.length();
         *         }
         *         return a.compareTo(b);
         *     }
         * }
         * 
         * Set<String> words = new TreeSet<>(new MyComparator());
        */
        
        /* [인터페이스 & 메서드 정리]  
         * 
         * Set : 집합 인터페이스 (중복 허용 X, 순서 보장 X)  
         * ㄴ TreeSet : Set의 구현체 (자동 정렬)
         *  
         * Comparator : 객체 비교 규칙을 정의하는 인터페이스 
         * ㄴ comparingInt(String::length) : 문자열 길이 기준 정렬
         *   ㄴ comparingInt() : int 값을 꺼내 비교 기준 생성 
         *   ㄴ String::length : 문자열 하나를 받아서 s.length() 반환  
         * ㄴ thenComparing() : 1차 기준이 같을 때 적용할 추가 기준 
         * ㄴ naturalOrder() : 기본 정렬 (숫자 -> 오름차순, 문자열 -> 사전순)  
         */ 

        for (int i = 0; i < N; i++) {
            words.add(sc.nextLine());
        }

        for (String word : words) {
            System.out.println(word);
        }
    }
}