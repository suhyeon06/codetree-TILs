import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String sorted = new String(c);
        System.out.println(sorted);
    }
}