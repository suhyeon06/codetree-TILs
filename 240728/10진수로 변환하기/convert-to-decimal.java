import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        String s = sc.next();

        for(int i = s.length()-1; i >= 0; i--) {
            q.add(Integer.parseInt(s.substring(i,i+1)));
        }

        int sum = 0;
        int mul = 1;

        while(!q.isEmpty()) {
            int num = q.poll();
            sum += num * mul;
            mul *= 2;
        }

        System.out.println(sum);
    }
}