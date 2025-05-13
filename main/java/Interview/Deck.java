package Interview;

import java.io.IOException;
import java.util.Random;


/**
 * This is a template for modelling a deck of cards.
 * <p>
 * This is intended to be a standard deck of 52 cards as: https://en.wikipedia.org/wiki/Standard_52-card_deck
 * <p>
 * The intention of this exercise is to implement the method stubs below
 */
public class Deck {
    int cardSize = 52;
    Card[] deckOfCards = new Card[cardSize];

    public Deck() {
        int count = 0;
        String[] deckPart = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};
        String[] suit = {"Diamonds", "Spades", "Hearts", "Clubs"};

        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; i < deckPart.length; j++) {
                Card card = new Card(suit[i], deckPart[j]);
                this.deckOfCards[count] = card;
                count++;
            }
        }
    }

    /**
     * This will change the order of the cards in to a random order.
     * Math.random() is allowed, but no shuffle methods of collections.
     */
    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < deckOfCards.length; i++) {
            int j = rand.nextInt(cardSize);
            Card temp = deckOfCards[i];
            deckOfCards[i] = deckOfCards[j];
            deckOfCards[j] = temp;
        }
    }

    public void showCards() {

        int c = 0;

        for (Card card : deckOfCards) {

            System.out.println("card Suit =" + card.Suit + "card rank =" + card.rank);


        }

    }


    //TODO: Implement shuffle

    public void Cards() {

    }

    public static void main(String[] args) throws IOException {

        Deck deck = new Deck();
        long start = System.currentTimeMillis();
        int shuffles = 10;
        for (int i = 0; i < shuffles; i++) {
            deck.shuffle();
        }
        long end = System.currentTimeMillis();

        long duration = end - start;

        System.out.println("Time for " + shuffles + " was " + duration);

        deck.shuffle();
    }
}
