/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

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

    /**
     * Ask the user to pick a card and search the magic hand.
     */
    public void searchMagicHand() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPick a card (enter value and suit):");
        int userValue = scanner.nextInt();
        String userSuit = scanner.next();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        // Search for the user's card in the magic hand
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        // Report the result
        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry! Your card is not in the magic hand.");
        }
    }

    public static void main(String[] args) {
        // Create an instance of CardTrick
        CardTrick cardTrick = new CardTrick();

        // Display the hand of seven cards
        cardTrick.displayMagicHand();

        // Ask the user to pick a card and search the magic hand
        cardTrick.searchMagicHand();
    }
}
