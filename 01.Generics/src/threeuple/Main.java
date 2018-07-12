package threeuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] line1 = reader.readLine().split(" ");
        String name = line1[0] + " " + line1[1];
        String address = line1[2];
        String town = line1[3];
        Threeuple<String, String, String> first = new Threeuple<>(name,address,town);
        System.out.println(first.toString());

        String[] line2 = reader.readLine().split(" ");
        String name1 = line2[0];
        int litres = Integer.parseInt(line2[1]);
        String drunkOrNot = line2[2];
        String drunk;
        if(drunkOrNot.equals("drunk")) {
            drunk = "true";

        }else{
            drunk = "false";
        }
        Threeuple<String, Integer, String> second = new Threeuple<>(name1, litres, drunk);
        System.out.println(second.toString());

        String[] line3 = reader.readLine().split(" ");
        String name2 = line3[0];
        Double balance = Double.parseDouble(line3[1]);
        String bankName = line3[2];
        Threeuple<String, Double, String> third = new Threeuple<>(name2, balance, bankName);
        System.out.println(third.toString());

    }
}
