/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop3_2;

/**
 *
 * @author ADMIN
 */
public class Main {
    
    public static void main(String[] args) {
        
        Atom []a=new Atom[10];
        int i,j;
        for(i=0;i<10;i++){
            a[i]=new Atom();
            a[i].accept();
           
            if(a[i].stop){
                break;
            }
        
        }
        for(j=0;j<i;j++){
            
            a[j].display();
        }
        
      
        
    }
}
