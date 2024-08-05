import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars1 = br.readLine().toCharArray();
        char[] chars2 = br.readLine().toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        String str1 = new String(chars1);
        String str2 = new String(chars2);
        
        if(str1.equals(str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}