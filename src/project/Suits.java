/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author 
 */
public enum Suits {
    CLUBS("Clubs"),
    SPADES("Spades"),
    DIAMONDS("Diamonds"),
    HEARTS("Hearts");
    
    private String strValue;
    
    private Suits(String strValue) {
        this.strValue = strValue;
    }
    
    public String getStr() {
        return strValue;
    }
}
