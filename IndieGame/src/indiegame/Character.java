/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package indiegame;

/**
 *
 * @author ncc
 */
public class Character {
    private Species speciesType;
    private Double bitcoin;
    private String name;
    
    public Character(Species speciesType) {
        this.speciesType = speciesType;
        this.name = "YouShouldveGivenMeANameNotThisMonstrosity";
    }
    
    public Species getSpecies() {
        return speciesType;
    }
    
    public void setBitcoin(Double amount) {
        this.bitcoin = amount;
    }
    
    public Double getBitcoin() {
        return this.bitcoin;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
}
