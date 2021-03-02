/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_1;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class PickTwoCard3 {
    
    public static void main(String[] args) {
        War2 c = new War2();
        Random r = new Random();
        
        int aleatorio = r.nextInt(13) + 1;
        int suit = r.nextInt(4)+1;
        int repetir=0;
        
        c.setSuit(suit);
        c.setNumero(aleatorio);
        
        do{        
            aleatorio = r.nextInt(13) + 1;
            suit = r.nextInt(4)+1;
        
            c.setSuit2(suit);
            c.setNumero2(aleatorio);
        
            if(c.evaluar() == 1){
                repetir = 1;
            }
            
        }while(repetir ==0);
        
        c.imprimirCpu();
        c.imprimirHum();
        
        System.out.println("");
        c.ganador();
    }
}
