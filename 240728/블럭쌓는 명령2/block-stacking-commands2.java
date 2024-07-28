import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] block = new int[n+1];

        for(int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for(int j = a; j <= b; j++) {
                block[j]++;
            }
        }

        int max = -1;

        for(int i = 1; i <= n; i++) {
            if(max < block[i]) {
                max = block[i];
            }
        }

        System.out.println(max);

    }
}