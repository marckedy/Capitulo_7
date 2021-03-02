/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_2;

/**
 *
 * @author Usuario
 */
public class RockPaperScissors2 {
    
    private Juego2 jugador;
    private Juego2 computadora;
    private String texto;
    private int player = 0;

    public Juego2 getJugador1() {
        return jugador;
    }
    
    public int getJugadorNumero() {
        return player;
    }

    public void setJugador1(String texto) {
        
        if((texto.toUpperCase().charAt(0) == 'P') && (texto.toUpperCase().charAt(1) == 'I')){
            this.player = 1;
        }
        if((texto.toUpperCase().charAt(0) == 'P') && (texto.toUpperCase().charAt(1) == 'A')){
            this.player = 2;
        }
        if((texto.toUpperCase().charAt(0) == 'T') && (texto.toUpperCase().charAt(1) == 'I')){
            this.player = 3;
        }
    }
    
    public void playJugador(){
        switch(player){
            case 1: this.jugador = Juego2.Piedra; break;
            case 2: this.jugador = Juego2.Papel; break;
            case 3: this.jugador = Juego2.Tijeras; break;
        }
    }
    
    public Juego2 getComputadora() {
        return computadora;
    }

    public void setComputadora(int jugador2) {
        switch(jugador2){
            case 1: this.computadora = Juego2.Piedra; break;
            case 2: this.computadora = Juego2.Papel; break;
            case 3: this.computadora = Juego2.Tijeras; break;
        }
    }
}
