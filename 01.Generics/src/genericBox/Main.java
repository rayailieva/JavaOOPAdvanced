package genericBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Box> boxes = new ArrayList<>();

        for (int i = 0; i < n; i++){
            boxes.add(new Box(Integer.parseInt(scanner.nextLine())));
        }
        int[] swapCommand = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();

        Box temp = new Box(boxes.get(swapCommand[1]).getElement());
        boxes.set(swapCommand[1], boxes.get(swapCommand[0]));
        boxes.set(swapCommand[0], temp);
        boxes.forEach(x -> System.out.println(x.toString()));
    }
}
