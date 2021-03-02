/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TestEliza {
    
    public static void main(String[] args) {
        String texto;
        do{
        Eliza eliza = new Eliza();
        Scanner scanner = new Scanner(System.in);
        
        texto = scanner.nextLine();
        texto = texto.toUpperCase();
        
        eliza.my(texto);
        eliza.felling(texto);
        }while(!texto.equals("GOOD BY"));
    }
}
