/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan;

/**
 *
 * @author ASUS
 */
public class Latihan {
    public static void main(String[] args) {
         Latihan latihan = new Latihan();
     
     System.out.println(latihan.function());
     latihan.procedure();
    
    }
    private void procedure(){
         System.out.println("this is a procedure");
         
    }
    
    private int function(){
         return 1;
    }
    
}
