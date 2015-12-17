# Deck
My implementation of a deck of playing cards, designed to minimize the complexity of the operations implemented.

## Features

This implementation allows to get a 52-card deck functionality (no Jokers). It allows to:

1. Start a new deck with 52 cards:
    
    ```java
    Deck myDeck = new Deck();
    myDeck.shuffle();
    ```
    
2. Draw a card at random from the deck:
    
    ```java
    Card c = myDeck.dealRandomCard();
    ```
    
3. Remove a named card from the deck:
    
    ```java
    Card c = new org.kworks.deckproject.Card(E_CardValue.ACE, E_CardSuit.CLUBS);
    myDeck.removeCard(c);
    ```
    
4. Check how many cards are left:

    ```java
	int cardsLeft = deck.cardsLeft();
    ```
    
## Costs and Efficiency

| Method Name | Signature  | Complexity |
| ----------- | :--------: | :--------: |
| Constructor | `public Deck()`   |   O(N)     |
| Reset       | `public void shuffle()`|   O(M)     |
| Deal Random |  `public Card dealRandomCard()`   |   O(1)     |
| Remove org.kworks.deckproject.Card |  `public void removeCard(Card c)`   |   O(1)     |
| Cards Left |  `public int cardsLeft()`   |   O(1)     |

Where N is the number of cards in the deck (52), and M is the number of cards used, with either `dealRandomCard()` or `removeCard()`.

## Implementation Details
