package org.kworks.deckproject;

/**
 * Class that represents an individual card.
 * Contains information about the suit and the value of a card.
 * E.G: Ah would be initialized as
 *      new Card(E_CardValue.A, E_CardSuit.HEARTS)
 *
 */

public class Card {

    private E_CardValue value;
    private E_CardSuit suit;

    public Card(E_CardValue value, E_CardSuit suit) {
        this.value = value;
        this.suit = suit;
    }

    public E_CardValue getValor() {
        return value;
    }

    public E_CardSuit getPalo() {
        return suit;
    }
    
    public String toString() {
    	StringBuilder builder = new StringBuilder();
    	builder.append(this.value);
    	builder.append(this.suit);
		return builder.toString();
    }

    /**
     *
     * @return an integer to represent the card:
     *   return     | carta
     * --------------------------
     *      0       | Ac
     *      1       | Kc
     *    ...       | ...
     *     12       | 2c
     *     13       | Ah
     *     14       | Kh
     *    ...       | ...
     *     51       | 2s
     */
    public int toInt() {
        return (13*suit.getIdnum() + (14-value.getValor()));
    }

}
