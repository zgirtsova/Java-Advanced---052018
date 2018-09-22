package p04_cardToString;

public class Card {

    private CardRank cardRank;
    private CardSuits cardSuits;

    public Card(String rank, String suit) {
        this.setCardRank(rank);
        this.setCardSuits(suit);
    }

    private void setCardRank(String cardRank) {
        this.cardRank = Enum.valueOf(CardRank.class, cardRank.toUpperCase());
    }

    private void setCardSuits(String cardSuits) {
        this.cardSuits = Enum.valueOf(CardSuits.class, cardSuits.toUpperCase());
    }

    public CardRank getCardRank() {
        return this.cardRank;
    }

    public CardSuits getCardSuits() {
        return this.cardSuits;
    }

    public int getPower() {
        return this.getCardRank().getPower() + this.getCardSuits().getPower();
    }

    @Override
    public String toString() {
        // Card name: TWO of CLUBS; Card power: 2
        return String.format("Card name: %s of %s; Card power: %d",
                this.getCardRank().name(),
                this.getCardSuits().name(),
                this.getPower());
    }
}
