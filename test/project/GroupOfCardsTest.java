/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
    }
    
    /**
     * Test of showCards method, of class GroupOfCards.
     */
    @Test
    public void testShowCards() {
        System.out.println("showCards");
        GroupOfCards instance = new GroupOfCards();
        GroupOfCards temp = new GroupOfCards();
        ArrayList<GoFishCard> expResult = temp.showCards();
        ArrayList<GoFishCard> result = instance.showCards();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of shuffle method, of class GroupOfCards.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        GroupOfCards instance = new GroupOfCards();
        instance.shuffle();
    }

    /**
     * Test of getSize method, of class GroupOfCards.
     */
    @Test
    public void testGetSizeGood() {
        System.out.println("getSize");
        GroupOfCards instance = new GroupOfCards();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCards method, of class GroupOfCards.
     */
    @Test
    public void testSetCards() {
        System.out.println("setCards");
        ArrayList<GoFishCard> cards = new ArrayList<GoFishCard>();
        GroupOfCards instance = new GroupOfCards();
        instance.setCards(cards);
       
    }

    /**
     * Test of addCard method, of class GroupOfCards.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        GoFishCard c = null;
        GroupOfCards instance = new GroupOfCards();
        instance.addCard(c);
        
    }


    /**
     * Test of removeCard method, of class GroupOfCards.
     */
    @Test
    public void testRemoveCard_GoFishCard() {
        System.out.println("removeCard");
        GoFishCard c = new GoFishCard("Spades", 1);
        GroupOfCards instance = new GroupOfCards();
        boolean expResult = false;
        boolean result = instance.removeCard(c);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of displayCards method, of class GroupOfCards.
     */
    @Test
    public void testDisplayCards() {
        System.out.println("displayCards");
        GroupOfCards instance = new GroupOfCards();
        instance.displayCards();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isEmpty method, of class GroupOfCards.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        GroupOfCards instance = new GroupOfCards();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
