package genericCount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Box> elements = new ArrayList<>();

        for(int i = 0; i < n; i++){
            elements.add(new Box(Double.parseDouble(scanner.nextLine())));
        }

        double toCompare = Double.parseDouble(scanner.nextLine());
        int counter = 0;
        for (Box el: elements){
            if (el.compareTo(toCompare) > 0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
