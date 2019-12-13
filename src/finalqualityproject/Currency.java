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
public class Currency {
   
    public double currencyConverter(String from, String to, double v)
          {
            if (from == "USD") {
            if (to == "USD") {
                 v *= 1.00;
                System.out.println(v) ;
            }

            if (to == "GBP") {
                v *= 0.66;
               System.out.println(v);
            }

            if (to == "EUR") {
                v *= 0.93;
               System.out.println(v);
            }

            if (to == "JPY") {
                v *= 123.54;
               System.out.println(v);
            }
            return v;
        }

        if (from == "GBP") {
            if (to == "USD") {
                 v *= 1.51;
                System.out.println(v);
            }

            if (to == "GBP") {
                v *= 1.00;
                System.out.println(v);
            }

            if (to == "EUR") {
                v *= 1.41;
                System.out.println(v);
            }

            if (to == "JPY") {
                v *= 186.41;
                System.out.println(v);
            }
            return v;
        }

        if (from == "EUR") {
            if (to == "USD") {
                v *=1.073;
               System.out.println(v);
            }

            if (to == "GBP") {
                v *= 0.71;
               System.out.println(v);
            }

            if (to == "EUR") {
                v *= 1.00;
                System.out.println(v);
            }

            if (to == "JPY") {
                v *= 132.57;
                System.out.println( v);
            }
            return v;
        }

        if (from == "JPY") {
            if (to == "USD") {
                v *= 0.008;
                System.out.println(v);
            }

            if (to == "GBP") {
                v *= 0.005;
               System.out.println(v);
            }

            if (to == "EUR") {
                 v *= 0.007;
                System.out.println(v);
            }

            if (to == "JPY") {
                v *= 1.000;
               System.out.println(v);
            }
            return v;
        }
        return v; 
          }
}
