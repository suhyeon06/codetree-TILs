import java.io.*;
import java.util.*;

public class Main {
    static int n1;
    static int n2;
    static int[] arr1;
    static int[] arr2;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n1 = Integer.parseInt(st.nextToken());
        n2 = Integer.parseInt(st.nextToken());

        arr1 = new int[n1];
        arr2 = new int[n2];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n1; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n2; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        boolean flag = false;

        for(int i = 0; i <= n1 - n2; i++) {
            if(isSame(i)) {
                flag = true;
                break;
            }
        }

        System.out.println(flag ? "Yes" : "No");

    }

    public static boolean isSame(int n) {
        for(int i = 0; i < n2; i++) {
            if(arr1[i + n] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}