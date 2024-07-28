import java.util.*;

public class Main {
    public static int countTotalDay(int m, int d) {
        int[] dayOfMonth = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int cnt = d;

        for(int i = 0; i < m; i++) {
            cnt += dayOfMonth[i];
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String target = sc.next();

        String[] date = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int diff = countTotalDay(m2,d2) - countTotalDay(m1,d1) + 1;

        int result = diff / 7;
        int rest = diff % 7;

        for (int i = 0; i < rest; i++) {
            if (date[i].equals(target)) {
                result++;
            }
        }

        System.out.print(result);
    }
}