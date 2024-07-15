import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = 0;

        for(int i = 2; i <= n; i++) {
            if(n % i == 0 && m % i == 0) {
                result = Math.max(result, i);
            }
        }

        System.out.println(result == 0 ? 1 : result);
    }
}