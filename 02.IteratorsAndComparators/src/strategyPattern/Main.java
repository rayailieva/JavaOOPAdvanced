package strategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        Set<Person> byName = new TreeSet<>(new PersonComparatorByName());
        Set<Person> byAge = new TreeSet<>(new PersonComparatorByAge());

        for(int i = 0; i < n; i++){
            String[] tokens = reader.readLine().split(" ");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person person = new Person(name, age);
            byName.add(person);
            byAge.add(person);
        }
        byName.forEach(System.out::println);
        byAge.forEach(System.out::println);
    }
}
