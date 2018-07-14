package comparingObjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person> people = new ArrayList<>();

        String input = reader.readLine();

        while (!input.equals("END")){
            String[] tokens = input.split(" ");
            people.add(new Person(tokens[0], Integer.parseInt(tokens[1]), tokens[2]));
            input = reader.readLine();
        }

        int numPerson = Integer.parseInt(reader.readLine());
        Person toCompareWith = people.get(numPerson - 1);
        people.remove(toCompareWith);
        int equalPeople = 0;

        for (Person person: people){
            if (toCompareWith.compareTo(person) == 0){
                equalPeople++;
            }
        }
        if (equalPeople == 0){
            System.out.println("No matches");
        }else{
            System.out.printf("%s %s %s", equalPeople + 1, people.size() - equalPeople, people.size() + 1);
        }
    }
}
