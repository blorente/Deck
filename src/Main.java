
public class Main {


    public static void main(String args[]) {
        Deck deck = new Deck();
        deck.shuffle();
        deck.removeCard(new Carta(E_Carta_Valor.A,E_Carta_Palo.CLUBS));
        deck.removeCard(new Carta(E_Carta_Valor.DOS,E_Carta_Palo.CLUBS));
        deck.shuffle();
        deck.removeCard(new Carta(E_Carta_Valor.TRES,E_Carta_Palo.CLUBS));
    }

}
