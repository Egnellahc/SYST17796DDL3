/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class HandTest {
    
    public HandTest() {
    }

    /**
     * Test of generateHandFromDeck method, of class Hand.
     */
    @Test
    public void testGenerateHandFromDeckGood() {
        System.out.println("generateHandFromDeck");
        Deck deck = new Deck();
        Hand instance = new Hand(7);
        instance.generateHandFromDeck(deck);
        
    }
    
    /**
     * Test of generateHandFromDeck method, of class Hand.
     */
    @Test
    public void testGenerateHandFromDeckBad() {
        System.out.println("generateHandFromDeckBad");
        Deck deck = new Deck();
        Hand instance = new Hand(6);
        instance.generateHandFromDeck(deck);
        
    }

    /**
     * Test of drawFromDeck method, of class Hand.
     */
    @Test
    public void testDrawFromDeck() {
        System.out.println("drawFromDeck");
        Deck deck = new Deck();
        Hand instance = new Hand(7);
        instance.drawFromDeck(deck);
    }

    /**
     * Test of hasSameValueCard method, of class Hand.
     */
    @Test
    public void testHasSameValueCard() {
        System.out.println("hasSameValueCard");
        int value = 0;
        Hand instance = new Hand(7);
        boolean expResult = false;
        boolean result = instance.hasSameValueCard(value);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCardsFromOtherHand method, of class Hand.
     */
    @Test
    public void testGetCardsFromOtherHand() {
        System.out.println("getCardsFromOtherHand");
        Hand other = new Hand(7);
        int value = 1;
        Hand instance = new Hand(7);
        instance.getCardsFromOtherHand(other, value);
        
    }

    /**
     * Test of checkBook method, of class Hand.
     */
    @Test
    public void testCheckBookGood() {
        System.out.println("checkBook");
        Hand instance = new Hand(7);
        int expResult = -1;
        int result = instance.checkBook();
        assertEquals(expResult, result);
        
    }
    
     /**
     * Test of checkBook method, of class Hand.
     * 
     */
    @Test
    public void testCheckBookBad() {
        System.out.println("checkBookBad");
        Hand instance = new Hand(7);
        int expResult = 0;
        int result = instance.checkBook();
        if (expResult > result){
            System.out.println("CheckBook Bad Succeed");
        }
        
    }

    /**
     * Test of addBook method, of class Hand.
     */
    @Test
    public void testAddBook() {
        System.out.println("addBook");
        int value = 1;
        Hand instance = new Hand(7);
        instance.addBook(value);
        
    }
    
    /**
     * Test of addBook method, of class Hand.
     */
    @Test
    public void testAddBookBad() {
        System.out.println("addBook");
        int value = 1;
        Hand instance = new Hand(7);
        instance.addBook(value);
    }
    
    

    /**
     * Test of countCardsOfValue method, of class Hand.
     */
    @Test
    public void testCountCardsOfValue() {
        System.out.println("countCardsOfValue");
        int value = 1;
        Hand instance = new Hand(7);
        int expResult = 0;
        int result = instance.countCardsOfValue(value);
        assertEquals(expResult, result);
        
    }
    
}
