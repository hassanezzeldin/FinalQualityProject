/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalqualityproject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Doflamengo Onepiece
 */
public class Time {
    public  String conv (String city){
        DateFormat dateFormat = new SimpleDateFormat("HH");
        Date date = new Date();
        String a = dateFormat.format(date);
        int b = Integer.parseInt(a);

        DateFormat dateFormat2 = new SimpleDateFormat("mm");
        Date date2 = new Date();
        String c = dateFormat2.format(date2);
       
         

        
            if(city == "cairo"){
                b*=1;
                if(b>24)
         {
             b-=24;
         }
                System.out.println((b)+":"+c);}
             if(city == "paris"){
                  b*=1;
                 if(b>24)
         {
             b-=24;
         }
                System.out.println((b)+":"+c);}
            if(city == "london"){
                 b-=1;
                if(b>24)
         {
             b-=24;
         }
               System.out.println((b)+":"+c);}
            if(city == "bali"){
                 b+=6;
                if(b>24)
         {
             b-=24;
         }
               System.out.println((b)+":"+c);}
        
        return (b)+":"+c;
}
}
