package cardswithPower;

public class Card {
    private int power;
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        this.setPower(rank, suit);
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(Rank rank, Suit suit) {
        this.power = rank.getPower() + suit.getPower();
    }

    public Rank getRank() {
        return this.rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
}
