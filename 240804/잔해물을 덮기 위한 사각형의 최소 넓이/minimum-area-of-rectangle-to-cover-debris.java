import java.io.*;
import java.util.*;

public class Main {
    public static final int OFFSET = 1000;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] arr = new int[2001][2001];

        for(int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            x1 += OFFSET;
            y1 += OFFSET;
            x2 += OFFSET;
            y2 += OFFSET;

            for(int j = x1; j < x2; j++) {
                for(int k = y1; k < y2; k++) {
                    if(i == 0) {
                        arr[j][k] = 1;
                    } else {
                        arr[j][k] = 0;
                    }
                }
            }
        }

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        int cnt = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 1) {
                    cnt++;
                    if (i < minX) minX = i;
                    if (i > maxX) maxX = i;
                    if (j < minY) minY = j;
                    if (j > maxY) maxY = j;
                }
            }
        }

        if(cnt == 0) {
            System.out.println(0);
        } else {
            int width = maxX - minX + 1;
            int height = maxY - minY + 1;
            System.out.println(width * height);
        }
    }
}