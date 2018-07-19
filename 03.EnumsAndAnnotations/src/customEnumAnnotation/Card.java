package customEnumAnnotation;

public class Card {
    private int power;

    public Card(Suit suit, Rank rank) {
        this.setPower(suit, rank);
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(Suit suit, Rank rank) {
        this.power = rank.getPower() + suit.getPower();
    }

}
