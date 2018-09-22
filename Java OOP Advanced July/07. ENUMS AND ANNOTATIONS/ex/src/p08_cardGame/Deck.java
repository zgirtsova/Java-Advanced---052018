package p08_cardGame;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        seedCards();
    }

    public Iterable<Card> iterable() {
        return this.cards;
    }

    private void seedCards() {
        for (CardSuits suits : CardSuits.values()) {
            for (CardRank rank : CardRank.values()) {
                this.cards.add(new Card(rank.name(), suits.name()));
            }
        }
    }

    public boolean contains(Card card) {
        return this.cards.stream()
                .anyMatch(c -> c.equals(card));

//        return this.cards.stream().anyMatch(c ->
//                c.getRank().name().equals(card.getRank().name()) &&
//                        c.getSuits().name().equals(card.getSuits().name()));
    }

    public void removeCard(Card card) {
        this.cards.remove(card);
    }
}
