/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalqualityproject;

/**
 *
 * @author Doflamengo Onepiece
 */
public class FinalQualityProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Currency cur = new Currency();
       Time time = new Time();
       System.out.println("Currency");
       cur.currencyConverter("USD", "GBP",25);
       System.out.println("Time");
       time.conv("bali");
    }
    
}
