/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_3;

/**
 *
 * @author Usuario
 */

public class SecretPhrase {
    
    private String texto;
    private String respuesta;
    
    
    public SecretPhrase(){
        this.texto = "G* T***";
        this.respuesta = "GO TEAM";
    }

    public String getTexto() {
        return texto;
    }

    public String getRespuesta() {
        return respuesta;
    }
    
    
    
    public int caracter(char caracter){
        StringBuilder corregir = new StringBuilder(texto);
        
        int num = this.respuesta.indexOf(caracter);
        if(num >= 0){
            corregir.setCharAt(num, caracter);
            this.texto = corregir.toString();
        }else{
            return 0;
        }
        return 1;
    }
    
    public int comparar(){
        if(this.respuesta.equals(texto)){
            return 1;
        }
        return 0;
    }
}

