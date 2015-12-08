/**
 * Clase para representar una carta individual.
 * Contiene información sobre el palo y el valor de la carta.
 * E.G: La carta Ah se inicializaría con
 *      new Carta(E_Carta_Palo.HEARTS, E_Carta_Valor.A)
 *
 */

public class Card {

    private E_CardValue value;
    private E_CardSuit suit;

    public Card(E_CardValue value, E_CardSuit suit) {
        this.value =  value;
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
     * @return un int que representa a la carta:
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
