package cardSuits;

public class Main {
    public static void main(String[] args) {

        Suit[] suits = Suit.values();

        System.out.println("Card Suit:");

        for(Suit suit : suits){
            System.out.println(suit.toString());
        }
    }
}
