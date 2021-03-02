/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TestSecretPhrase {
    
    public static void main(String[] args) {
        
        char caracter;
        String texto;
        int intentar = -1;
        
        SecretPhrase adivinar = new SecretPhrase();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Adivina la frase ingresando letras");
        System.out.println(adivinar.getTexto());
        
        do{
            do{
                if(intentar == 0){
                    System.out.println("\nERROR\nIntenta de nuevo\n");
                }
                texto = scanner.next();
                caracter = texto.toUpperCase().charAt(0);
                intentar = adivinar.caracter(caracter);
                System.out.println(adivinar.getTexto());
            }while(intentar != 1);
        }while(adivinar.comparar() == 0);
        
        System.out.println("Bien echo la frase es: " + adivinar.getRespuesta());
        
        
    }
}
