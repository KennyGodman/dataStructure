package Chapter7;

import java.security.SecureRandom;

public class DeckOfCards {

    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final int NUMBER_OF_CARDS = 52;

    private Card[] deck = new Card[NUMBER_OF_CARDS];
    private int currentCard = 0;

    public DeckOfCards(){
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        for(int count = 0; count < deck.length; count++ ){
            deck[count] = new Card(faces[count % 13], faces[count / 13]);
            System.out.println(deck[count]);
        }
    }

    public void shuffle(){

        currentCard = 0;


        for(int first = 0; first < deck.length; first++){
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);


        }

    }
}
