package deckOfCards;

public class Card {

    private RankType rankType;

    private SuitType suitType;

    public Card(RankType rankType, SuitType suitType) {
        this.rankType = rankType;
        this.suitType = suitType;
    }

    public RankType getRankType() {
        return this.rankType;
    }

    public SuitType getSuitType() {
        return this.suitType;
    }

    public int getPower() {
        return this.rankType.getValue() + this.suitType.getValue();
    }

    @Override
    public String toString() {
        return String.format("%s of %s", this.rankType, this.suitType);
    }
}
