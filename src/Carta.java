/**
 * Clase para representar una carta individual.
 * Contiene información sobre el palo y el valor de la carta.
 * E.G: La carta Ah se inicializaría con
 *      new Carta(E_Carta_Palo.HEARTS, E_Carta_Valor.A)
 *
 */

public class Carta {

    private E_Carta_Valor valor;
    private E_Carta_Palo palo;

    public Carta(E_Carta_Valor valor, E_Carta_Palo palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public E_Carta_Valor getValor() {
        return valor;
    }

    public E_Carta_Palo getPalo() {
        return palo;
    }
    
    public String toString() {
    	StringBuilder builder = new StringBuilder();
    	builder.append(this.valor);
    	builder.append(this.palo);
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
        return (13*palo.getIdnum() + (14-valor.getValor()));
    }

}
