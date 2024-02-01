/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author - Khushpreet Na 
 * Student Number - 991669200
 */
public class CardTrick {
    
    private Card[] magicHand;

    /**
     * Constructor for the CardTrick class.
     */
    public CardTrick() {
        magicHand = new Card[7];
        fillMagicHandWithRandomCards();
    }

    /**
     * Fill the magic hand array with random cards.
     */
    private void fillMagicHandWithRandomCards() {
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(generateRandomValue());
            c.setSuit(generateRandomSuit());
            magicHand[i] = c;
        }
    }

    /**
     * Generate a random card value (1-13).
     * @return Random card value.
     */
    private int generateRandomValue() {
        return new Random().nextInt(13) + 1;
    }

    /**
     * Generate a random card suit.
     * @return Random card suit.
     */
    private String generateRandomSuit() {
        return Card.SUITS[new Random().nextInt(4)];
    }

    /**
     * Display the hand of seven cards.
     */
    public void displayMagicHand() {
        System.out.println("Magic Hand of Seven Cards:");
        for (Card card : magicHand) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }
    }

    public static void main(String[] args) {
        // Create an instance of CardTrick
        CardTrick cardTrick = new CardTrick();

        // Display the hand of seven cards
        cardTrick.displayMagicHand();
    }
}
