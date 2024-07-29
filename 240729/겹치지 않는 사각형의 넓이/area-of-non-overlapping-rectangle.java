import java.io.*;
import java.util.*;

public class Main {
    public static final int OFFSET = 1000;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] arr = new int[2001][2001];

        for(int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            x1 += OFFSET;
            y1 += OFFSET;
            x2 += OFFSET;
            y2 += OFFSET;

            int value = 1;

            if(i == 2) {
                value = 2;
            }

            for(int j = x1; j < x2; j++) {
                for(int k = y1; k < y2; k++) {
                    arr[j][k] = value;
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