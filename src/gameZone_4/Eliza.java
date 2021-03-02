/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_4;

/**
 *
 * @author Usuario
 */
public class Eliza {
    private String my;
    private String love;
    private String hate;

    public Eliza() {
        this.my = "MY";
        this.love = "LOVE";
        this.hate = "HATE";
    }
    
    public void my(String palabra){
        String texto = palabra;
        int num = texto.indexOf(this.my);
        
        if(num >= 0){
            System.out.print("TELL ME MORE ABOUT YOUR ");
            System.out.println(palabra.substring(num+3));
        }
    }
    
    public void felling(String palabra){
        String texto = palabra;
        int num = texto.indexOf(this.love);
        int num2 = texto.indexOf(this.hate);
        
        if(num >= 0){
            System.out.println("YOU SEEM TO HAVE STRONG FEELINGS ABOUT THAT ");
        }
        
        if(num2 >= 0){
            System.out.println("YOU SEEM TO HAVE STRONG FEELINGS ABOUT THAT ");
        }
    }
}
