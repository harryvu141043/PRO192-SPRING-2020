/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop3_1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
    static String structure;
    static String name;
    static double weight;
    static int size=0;
    static Molecule []m=new Molecule[100];
    public static void input(){
        
        Scanner t=new Scanner(System.in);
        do {   
            System.out.print("Enter structure :");
            structure=t.nextLine();
            if(structure.equals("0")){
                break;
            }
            System.out.print("Enter name :");
            name=t.nextLine();
            System.out.print("Enter weight :");
            weight=t.nextDouble();
            t.nextLine();
            m[size]=new Molecule(structure, name, weight);
            size++;
        } while (true);
         
        
    }
    public static void main(String[] args) {
        input();
        for(int i=0;i<size;i++){
            m[i].display();
        }
        
      
        
                
    }
}
