import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String T = st.nextToken();
        String[] arr = new String[n];

        for(int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr);

        int idx = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i].startsWith(T)) {
                idx++;
                if(idx == k) {
                    System.out.println(arr[i]);
                    break;
                }

            }
        }

    }
}