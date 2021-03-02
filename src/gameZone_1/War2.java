/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_1;

/**
 *
 * @author Usuario
 */
public class War2 {
    
    private Suit3 suit;
    private Suit3 suit2;
    private int num;
    private int num2;
    
    public War2(){
    this.num = 12; 
    this.num2 = 11;
    this.suit = Suit3.CORAZONES;
    this.suit2 = Suit3.PICAS;
    
    }
    
    public void setSuit(int s){
        switch(s){
            case 1: suit = Suit3.CORAZONES; break;
            case 2: suit = Suit3.DIAMANTES; break;
            case 3: suit = Suit3.PICAS; break;
            case 4: suit = Suit3.TREBOLES; break;
        }
    }
    
    public void setSuit2(int s){
        switch(s){
            case 1: suit2 = Suit3.CORAZONES; break;
            case 2: suit2 = Suit3.DIAMANTES; break;
            case 3: suit2 = Suit3.PICAS; break;
            case 4: suit2 = Suit3.TREBOLES; break;
        }
    }
    
    public Suit3 getSuit(){
        return this.suit;
    }
    
    public Suit3 getSuit2(){
        return this.suit2;
    }
    
    public void setNumero(int num){
        this.num = num;
    }
    
    public void setNumero2(int num){
        this.num2 = num;
    }
    
    public int getNumero(){
        return this.num;
    }
    
    public int getNumero2(){
        return this.num2;
    }
    
    public int evaluar(){
        if((this.num == this.num2) && (this.suit == this.suit2)){
            return 0;
        }
        return 1;
    }
    
    public void ganador(){
        if(this.num == this.num2){
            System.out.println("Es un empate");
        }else{
            if(this.num > this.num2){
                System.out.println("Gano la computadora");
            }else{
                System.out.println("Gano el humano");
            }
        }
    }
    
    public void imprimirCpu(){
        System.out.println("Juego de la computadora");
        switch(this.num){
            case 1: System.out.println("Ace de " + this.suit); break;
            case 2: System.out.println("2 " + this.suit); break;
            case 3: System.out.println("3 " + this.suit); break;
            case 4: System.out.println("4 " + this.suit); break;
            case 5: System.out.println("5 " + this.suit); break;
            case 6: System.out.println("6 " + this.suit); break;
            case 7: System.out.println("7 " + this.suit); break;
            case 8: System.out.println("8 " + this.suit); break;
            case 9: System.out.println("9 " + this.suit); break;
            case 10: System.out.println("Ace de " + this.suit); break;
            case 11: System.out.println("Jack de " + this.suit); break;
            case 12: System.out.println("Queen de " + this.suit); break;
            case 13: System.out.println("King de " + this.suit); break;
        }
        System.out.println("");
    }
    
    public void imprimirHum(){
        System.out.println("Juego del humano");
        switch(this.num2){
            case 1: System.out.println("Ace de " + this.suit2); break;
            case 2: System.out.println("2 " + this.suit2); break;
            case 3: System.out.println("3 " + this.suit2); break;
            case 4: System.out.println("4 " + this.suit2); break;
            case 5: System.out.println("5 " + this.suit2); break;
            case 6: System.out.println("6 " + this.suit2); break;
            case 7: System.out.println("7 " + this.suit2); break;
            case 8: System.out.println("8 " + this.suit2); break;
            case 9: System.out.println("9 " + this.suit2); break;
            case 10: System.out.println("Ace de " + this.suit2); break;
            case 11: System.out.println("Jack de " + this.suit2); break;
            case 12: System.out.println("Queen de " + this.suit2); break;
            case 13: System.out.println("King de " + this.suit2); break;
        }
        System.out.println("");
    }
}
