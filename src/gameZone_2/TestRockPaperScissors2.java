/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TestRockPaperScissors2 {
    public static void main(String[] args) {
        int computadora;
        String texto;
        int intentar = 0;
        
        RockPaperScissors2 juego = new RockPaperScissors2();
        Random play = new Random();
        Scanner scanner = new Scanner(System.in); 
        
        computadora = play.nextInt(3)+1;
        
        System.out.println("Escribe Piedra, papel o tijeras");
        do{
            
            if(intentar > 0){
                System.out.println("\nERROR\nIntenta de nuevo");
            }
            
            texto = scanner.next();
            juego.setJugador1(texto);
            intentar++;
        }while(juego.getJugadorNumero() == 0);
        
        
        juego.playJugador();
        juego.setComputadora(computadora);
        
        
        System.out.println("");
        System.out.println("Jugador");
        System.out.println(juego.getJugador1());
        
        System.out.println("");
        
        System.out.println("Computadora");
        System.out.println(juego.getComputadora());
        
        System.out.println("");
        
        TestRockPaperScissors2.evaluar(juego.getJugadorNumero(), computadora);
        
    }
    
    public static void evaluar(int jugador1, int jugador2){
        if(jugador1 == jugador2){
            System.out.println("Empate");
        }else{
            switch(jugador1){
                case 1: TestRockPaperScissors2.evaluar1(jugador2); break;
                case 2: TestRockPaperScissors2.evaluar2(jugador2); break;
                case 3: TestRockPaperScissors2.evaluar3(jugador2); break;
            }
        }
    }
    
    public static void evaluar1(int jugador2){
        if(jugador2 == 2){
            System.out.println("Gano la computadora");
        }else{
            System.out.println("Gano el jugador");
        }
    }
    
    public static void evaluar2(int jugador2){
        if(jugador2 == 3){
            System.out.println("Gano la computadora");
        }else{
            System.out.println("Gano el jugador");
        }
    }
    
    public static void evaluar3(int jugador2){
        if(jugador2 == 1){
            System.out.println("Gano la computadora");
        }else{
            System.out.println("Gano el jugador");
        }
    }
}
