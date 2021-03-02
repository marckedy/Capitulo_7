/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblems_2;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class TestSammysRentalPrice5 {
    
    public static void main(String[] args) {
        
        String telefono;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de control");
        String control;
        
        do{
            control = scanner.next();
            control = control.toUpperCase();
        }while(TestSammysRentalPrice5.evaluarNumeroControl(control) == 0);
        
        
        System.out.println("Ingrese el numero de minutos");
        int minutos = scanner.nextInt();
        
        System.out.println("Ingrese su numero telefonico");
        Rental5 renta = new Rental5(control, minutos);
        
        do{
        telefono = scanner.next();
        renta.setTelefono(telefono);
        
        }while(TestSammysRentalPrice5.evaluarNumeroTelefono(telefono) == 0);
        
        
        int tiempo1 = renta.getNumeroSegundos();
        System.out.println("");
        renta.imprimir();
    }
    
    public static int evaluarNumeroControl(String control){
        if(control.length() == 4){
            return 1;
        }
        System.out.println("Debe de ser de 4 dijitos");
        return 0;
    }
    
    public static int evaluarNumeroTelefono(String num){
        if((num.length() == 10)){
            return 1;
        }
        System.out.println("El numero telefonico debe ser 10 dígitos");
        return 0;
    }
}
