/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author User
 */
public class GoFishTest {
    
    public GoFishTest() {
    }
    


    /**
     * Test of generateRandomNumberGood method, of class GoFish.
     */
    @Test 
    public void testGenerateRandomNumberGood() {
        System.out.println("generateRandomNumberGood");
        int maxVal = (int) (Math.random()*13);
        GoFish instance = new GoFish("1");
        instance.generateRandomNumber(maxVal);
        
    }
    
    /**
     * Test of generateRandomNumberBad method, of class GoFish.
     */
    @Test 
    public void testGenerateRandomNumberBad() {
        System.out.println("generateRandomNumberBad");
        int maxVal = (int) (Math.random()*12);
        GoFish instance = new GoFish("1");
        instance.generateRandomNumber(maxVal);
        
    }

    /**
     * Test of declareWinner method, of class GoFish.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinnerGood");
        GoFish instance = new GoFish("1");
        instance.declareWinner();
    }
    

    /**
     * Test of displayBook method, of class GoFish.
     */
    @Test
    public void testDisplayBook() {
        System.out.println("displayBook");
        GoFish instance = new GoFish("1");
        instance.displayBook();
        
    }
    
    /**
     * Test of generateDeck method, of class Deck.
     */
    
    @Test
    public void generateDeckGood(){
        System.out.println("generateDeckGood");
        Suits suit = Suits.CLUBS;
        Values value = Values.ACE;
        
        for(Suits s: suit.values()){
                 
            for(Values v : value.values()){
                GoFishCard card = new GoFishCard(s.getStr(),v.getNumValue());
            }
        }
    }
    
    
}
