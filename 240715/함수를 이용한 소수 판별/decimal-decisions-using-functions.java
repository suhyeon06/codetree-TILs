import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;

        for(int i = a; i <= b; i++) {
            if(i == 1) continue;
            
            if(isPrime(i)) {
                sum += i;
            }
        }

        System.out.println(sum);
        
    }


    public static boolean isPrime(int num) {
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}