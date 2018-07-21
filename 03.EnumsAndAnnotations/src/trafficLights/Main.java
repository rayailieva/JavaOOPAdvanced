package trafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        TrafficLight trafficLight = null;
        List<Light> lights = new ArrayList<>();

        for(String item : input){
            if(item.equals("Red") || item.equals("Green")
        || item.equals("Yellow")){
                Light light;
                Enum.valueOf(Light.class,item.toUpperCase());
            }
        }
    }
}
