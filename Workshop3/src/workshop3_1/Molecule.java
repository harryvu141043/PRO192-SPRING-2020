/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop3_1;

/**
 *
 * @author ADMIN
 */
public class Molecule {
    private String structure;
    private String name;
    private double weight;
    

    public Molecule() {
    }

    public Molecule(String structure, String name, double weight) {
        this.structure = structure;
        this.name = name;
        this.weight = weight;
       
    }
    

    
    void display(){
        System.out.println(structure + "\t" + name + "\t" +weight) ;
    }
    
    
}
