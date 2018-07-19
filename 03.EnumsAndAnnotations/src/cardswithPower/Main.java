package cardswithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Rank rank = Rank.valueOf(scanner.nextLine());
        Suit suit = Suit.valueOf(scanner.nextLine());

        Card card = new Card(rank,suit);

        String result =
                String.format("Card name: %s of %s; Card power: %d", rank, suit, card.getPower());

        System.out.println(result);
    }
}
