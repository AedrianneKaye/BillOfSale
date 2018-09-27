/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package billofsale;

/**
 *
 * @author aemal4075
 */
public class BillOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double price = 12.49;
        double money = 20;
        double tax = .13;
        double change = 0; 
        
        // algorithm to BillOfSale
        
        change = money -(price*tax)-price;
        System.out.println("The change given back is " + change );
    }
    
}
