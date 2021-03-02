/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblems_1;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class TestEvent {
    
    public static void main(String[] args) {
        int evaluar;
        String telefono;
        String numeroEvento;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de evento");
        do{
            numeroEvento = scanner.next();
            numeroEvento = numeroEvento.toUpperCase();
            evaluar = TestEvent.evaluarNumeroEvento(numeroEvento);
        }while(evaluar == 0);
        
        
        System.out.println("Ingrese el numero de invitados");
        int invitados = scanner.nextInt();
        
        System.out.println("Ingrese un numero de contacto");
                 
        Event evento = new Event(numeroEvento, invitados);
        
        do{
        telefono = scanner.next();
        evento.setTelefono(telefono);
        
        }while(TestEvent.evaluarTelefono(telefono) == 0);
        
        System.out.println("");
        evento.imprimir();
        
        
    }
    
    public static int evaluarNumeroEvento(String evaluar){
        if(evaluar.length() != 4){
            System.out.println("Debe ser de 4 digitos");
            return  0;
        }
        
        
        return  1;
    }
    
    public static int evaluarTelefono(String num){
        
        if((num.length() == 10)){
            return 1;
        }
        System.out.println("El numero telefonico debe ser 10 dígitos");
        return 0;
    }
}
