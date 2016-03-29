/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parameter;

/**
 *
 * @author ASUS
 */
public class Parameter {
 
    public static void main(String[] args) {
      Parameter parameter = new Parameter();
      parameter.tambah(1, 2);
      parameter.kurang(5, 4);
      parameter.bagi(10, 2);
 
    }
 
    private void tambah(int a, int b){
        int hasil;
        hasil = a + b;
        System.out.println(hasil);
 
    }
    private void kurang(int a, int b){
        int hasil;
        hasil = a - b;
        System.out.println(hasil);
    }
    private void bagi(int a, int b){
        int hasil;
        hasil = a / b;
        System.out.println(hasil);
    }
   
    
}
