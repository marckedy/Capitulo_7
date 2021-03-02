/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercio_7;

/**
 *
 * @author Usuario
 */
public class DemonstratingStringMethods {
    public static void main(String[] args) {
        
        String texto = "You can never cross the ocean until you have the courage to lose sight of the shore";
        
        int num = texto.indexOf("never");
        
        
        System.out.println(num);
        System.out.println(texto.charAt(2));
        System.out.println(texto.indexOf('o'));
        System.out.println(texto.endsWith(texto));
        System.out.println(texto.replace("the", "Karim"));
        System.out.println(texto.toUpperCase());
        System.out.println(texto.toUpperCase().replace("YOU", "QUE ONDA"));
        System.out.println(texto.substring(7));
    }
}
