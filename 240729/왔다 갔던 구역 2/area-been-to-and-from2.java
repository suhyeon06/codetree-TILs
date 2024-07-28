import java.io.*;
import java.util.*;

public class Main {
    public static final int OFFSET = 1000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[2001];
        int cur = 0;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int distance = Integer.parseInt(st.nextToken());
            char dir = st.nextToken().charAt(0);

            int x1;
            int x2;

            if(dir == 'L') {
                x1 = cur - distance;
                x2 = cur;
                cur -= distance;
            } else {
                x1 = cur;
                x2 = cur + distance;
                cur += distance;
            }

            x1 += OFFSET;
            x2 += OFFSET;

            for(int j = x1; j < x2; j++) {
                arr[j]++;
            }
        }

        int cnt = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 2) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}