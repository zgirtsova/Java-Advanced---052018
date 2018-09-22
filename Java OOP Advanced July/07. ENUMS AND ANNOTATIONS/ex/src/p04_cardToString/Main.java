package p04_cardToString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String cardRank = reader.readLine();
        String cardSuit = reader.readLine();

        try {
            Card card = new Card(cardRank, cardSuit);

            System.out.println(card.toString());
        } catch (IllegalArgumentException ignored) {
            ;
        }
    }
}
