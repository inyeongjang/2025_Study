import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = new String[3];
        for (int i = 0; i < 3; i++) s[i] = br.readLine().trim();

        int next = -1;
        for (int i = 0; i < 3; i++) {
            if (isNumber(s[i])) {
                next = Integer.parseInt(s[i]) + (3 - i);
                break;
            }
        }

        if (next % 15 == 0) System.out.println("FizzBuzz");
        else if (next % 3 == 0) System.out.println("Fizz");
        else if (next % 5 == 0) System.out.println("Buzz");
        else System.out.println(next);
    }
}
