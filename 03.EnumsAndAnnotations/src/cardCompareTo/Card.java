package cardCompareTo;

public class Card implements Comparable<Card>{
    private int power;
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
        this.setPower(suit, rank);
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(Suit suit, Rank rank) {
        this.power = rank.getPower() + suit.getPower();
    }

    public Suit getSuit() {
        return this.suit;
    }

    public Rank getRank() {
        return this.rank;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", this.getRank(), this.getSuit(), this.getPower());
    }

    @Override
    public int compareTo(Card o) {
       return Integer.compare(this.getPower(), o.getPower());
    }
}
