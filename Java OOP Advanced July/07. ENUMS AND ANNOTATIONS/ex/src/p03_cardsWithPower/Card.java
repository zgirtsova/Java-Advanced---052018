package p03_cardsWithPower;

public class Card {

    private CardRank rank;
    private CardSuits suits;

    public Card(String rank, String suit) {
        this.setRank(rank);
        this.setSuits(suit);
    }

    private void setRank(String rank) {
        this.rank = Enum.valueOf(CardRank.class, rank.toUpperCase());
    }

    private void setSuits(String suits) {
        this.suits = Enum.valueOf(CardSuits.class, suits.toUpperCase());
    }

    public CardRank getRank() {
        return this.rank;
    }

    public CardSuits getSuits() {
        return this.suits;
    }

    public int getPower() {
        return this.getRank().getPower() + this.getSuits().getPower();
    }

    @Override
    public String toString() {
        return String.format("%s of %s",
                this.getRank().name(),
                this.getSuits().name());
    }
}
