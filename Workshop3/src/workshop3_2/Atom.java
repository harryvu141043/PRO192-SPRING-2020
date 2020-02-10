/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop3_2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Atom {
    private  int number;
    private    String symbol;
    private   String name;
    private    double weight;
     boolean stop=false;
    public Atom() {
        
    }
     void accept(){
        Scanner t=new Scanner(System.in);
          
            System.out.print("Enter atomic number :");
            number=t.nextInt();
            t.nextLine();
            if(number!=0){
               
                System.out.print("Enter symbol :");
                symbol=t.nextLine();
                System.out.print("Enter full name :");
                name=t.nextLine();
                System.out.print("Enter atomic weight :");
                weight=t.nextDouble();
                 
            }
            else{
                stop=true;
            }
            
    
        
    }
     void display(){
        System.out.println(number+"\t"+symbol+"\t"+name+"\t"+weight);
    }

}
