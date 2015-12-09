package org.kworks.deckproject;

import java.util.Random;

/**
 *  An object of type Deck represents a deck of playing cards.  The deck
 *  is a regular poker deck that contains 52 regular cards.
 */
public class Deck {

    /**
     * An array of 52 or 54 cards.  A 54-card deck contains two Jokers,
     * in addition to the 52 cards of a regular poker deck.
     *
     * Array with cards in random positions.
     */
    private Card[] deck;

    /**
     * Array with the indexes of all the cards in deck[].
     * It is updated whenever we change the index of any card in deck[].
     *
     *      i       | indexes[i]
     * --------------------------
     *      0       | index of Ac in deck[]
     *      1       | index of Kc in deck[]
     *    ...       | ...
     *     13       | index of 2c in deck[]
     *     14       | index of Ah in deck[]
     *     15       | index of Kh in deck[]
     *    ...       | ...
     *     51       | index of 2s in deck[]
     *
     */
    private int[] indexes;


    /**
     * Keeps track of the number of cards that have been dealt from
     * the deck so far.
     *
     * Also marks the first unused card (deck[cardsUsed]).
     */
    private int cardsUsed;

    /**
     * Constructs a poker deck of playing cards, The deck contains
     * the usual 52 cards.
     * Initially the cards are in a sorted order.
     * The shuffle() method can be called to randomize the order.
     */
    public Deck() {

        deck = new Card[52];
        indexes = new int[52];

        int cardsAdded = 0;
        for (int suit = 0; suit < 4; suit++) {
            for (int value = 14; value > 1; value--) {
                deck[cardsAdded] = new Card(E_CardValue.getValueByInt(value),
                                                E_CardSuit.getSuitByInt(suit));
                indexes[cardsAdded] = cardsAdded;
                cardsAdded++;
            }
        }

        cardsUsed = 51;
    }

    /**
     * Put all the used cards back into the deck (if any), and
     * shuffle the deck into a random order.
     *
     * Update the indexes array accordingly.
     */
    public void shuffle() {
        int rand;
        Random random = new Random();
        for (int i = 0; i < cardsUsed; i++) {
            //Get random index to swap to
            rand = (random.nextInt(deck.length));
            swap(deck[i], deck[rand]);
        }

        cardsUsed = 0;
    }

    /**
     * As cards are dealt from the deck, the number of cards left
     * decreases.  This function returns the number of cards that
     * are still left in the deck.  The return value would be 52
     * when the deck is first created or after the deck has been
     * shuffled.  It decreases by 1 each time the dealCard() method
     * is called.
     */
    public int cardsLeft() {
        return deck.length - cardsUsed;
    }

    /**
     * Removes the next card from the deck and return it.  It is illegal
     * to call this method if there are no more cards in the deck.  You can
     * check the number of cards remaining by calling the cardsLeft() function.
     * @return the card which is removed from the deck.
     * @throws IllegalStateException if there are no cards left in the deck
     */
    public Card dealRandomCard() {
        if (cardsUsed == deck.length)
            throw new IllegalStateException("No cards are left in the deck.");
        cardsUsed++;
        return deck[cardsUsed - 1];
        // Programming note:  Cards are not literally removed from the array
        // that represents the deck.  We just keep track of how many cards
        // have been used.
    }

    /**
     * Removes the selected card from the deck, by exchanging it with the first unused card.
     * @param card
     */
    public void removeCard(Card card) {

        if (cardsUsed > indexes[card.toInt()]) {
            throw new IllegalStateException("This card has already been dealt.");
        } else if (card.toInt() > deck.length) {
            throw new ArrayIndexOutOfBoundsException("org.kworks.deckproject.Card out of the deck.");
        }
        //Exchange the chosen card with the first unused card.
        swap(deck[cardsUsed], card);

        //Incrementa el contador
        cardsUsed++;
    }

    private void swap(Card card1, Card card2) {
        //Exchange the chosen card with the first unused card.
        //  Swap cards
        Card temp = card1;
        deck[indexes[card1.toInt()]] = deck[indexes[card2.toInt()]];
        deck[indexes[card2.toInt()]] = temp;
        //  Swap indexes
        int tempIndex = indexes[card2.toInt()];
        indexes[card2.toInt()] = indexes[card1.toInt()];
        indexes[card1.toInt()] = tempIndex;
    }


} // end class Deck
