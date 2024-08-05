import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Person[] list = new Person[n];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String addr = st.nextToken();
            String city = st.nextToken();
            list[i] = new Person(name, addr, city);
        }

        Arrays.sort(list);

        System.out.println("name " + list[0].name);
        System.out.println("addr " + list[0].addr);
        System.out.println("city " + list[0].city);


    }
}

class Person implements Comparable<Person>{
    String name;
    String addr;
    String city;

    public Person(String name, String addr, String city) {
        this.name = name;
        this.addr = addr;
        this.city = city;
    }

    @Override
    public int compareTo(Person o) {
        return o.name.compareTo(this.name);
    }
}