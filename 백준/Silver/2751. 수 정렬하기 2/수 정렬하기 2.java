import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
         * IOException : 입출력 과정에서 발생할 수 있는 예외 
         * 
         * 입력 (BufferedReader) : 입력을 버퍼에 저장한 뒤 한 번에 읽어 성능 향상 
         * ㄴ InputStreamReader : 바이트 스트림(System.in)을 문자 스트림으로 변환 
         * ㄴ readLine() : 한 줄을 문자열(String)로 읽음 -> Integer.parseInt()로 숫자로 변환 
         * 
         * 출력 (BufferedWriter) : 출력할 내용을 버퍼에 모았다가 한 번에 내보냄 
         * ㄴ OutputStreamWriter : 문자 스트림을 바이트 스트림(System.out)으로 변환
         * ㄴ write() : 문자열을 출력 버퍼에 저장
         * ㄴ flush() : 버퍼에 남아 있는 내용을 실제 출력 
         */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        
        int N = Integer.parseInt(br.readLine()); 
        int[] arr = new int[N]; 

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine()); 
        }

        Arrays.sort(arr); 

        for (int num : arr) {
            bw.write(num + "\n");
        }

        bw.flush();
    }
}