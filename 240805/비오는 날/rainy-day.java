import java.io.*;
import java.util.*;
import java.time.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Weather[] list = new Weather[n];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            LocalDate date = LocalDate.parse(st.nextToken());
            String day = st.nextToken();
            String state = st.nextToken();
            list[i] = new Weather(date, day, state);
        }

        Arrays.sort(list);

        for(int i = 0; i < n; i++) {
            if(list[i].state.equals("Rain")) {
                System.out.println(list[i]);
                break;
            }
        }
    }
}

class Weather implements Comparable<Weather>{
    LocalDate date;
    String day;
    String state;

    public Weather(LocalDate date, String day, String state) {
        this.date = date;
        this.day = day;
        this.state = state;
    }

    @Override
    public int compareTo(Weather o) {
        return this.date.compareTo(o.date);
    }

    public String toString() {
        return date + " " + day + " " + state;
    }
}