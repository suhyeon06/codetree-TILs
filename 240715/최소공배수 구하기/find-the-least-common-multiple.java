import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int gcd = 0;

        for(int i = 1; i <= Math.max(n,m); i++) {
            if(n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }

        int result = gcd * (n/gcd) * (m/gcd);
        System.out.println(result);
    }
}