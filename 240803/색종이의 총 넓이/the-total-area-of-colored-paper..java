import java.io.*;
import java.util.*;

public class Main {
    public static final int OFFSET = 100;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[][] arr = new int[201][201];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());

            x1 += OFFSET;
            y1 += OFFSET;
            int x2 = x1 + 8;
            int y2 = y1 + 8;

            for(int j = x1; j < x2; j++) {
                for(int k = y1; k < y2; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        int cnt = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 1) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
        
    }
}