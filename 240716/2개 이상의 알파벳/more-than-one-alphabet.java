import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] alpha = new int[26];

        for(int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i)-'a']++;
        }

        int cnt = 0;

        for(int i = 0; i < alpha.length; i++) {
            if(alpha[i] > 0) {
                cnt++;
            }
        }

        System.out.println(cnt >= 2 ? "Yes" : "No");

    }
}