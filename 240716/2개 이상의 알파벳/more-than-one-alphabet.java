import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] alpha = new int[26];

        for(int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i)-'a']++;
        }

        boolean result = false;

        for(int i = 0; i < alpha.length; i++) {
            if(alpha[i] > 1) {
                result = true;
                break;
            }
        }

        System.out.println(result ? "Yes" : "No");

    }
}