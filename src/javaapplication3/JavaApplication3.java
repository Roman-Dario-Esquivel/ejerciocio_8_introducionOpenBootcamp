/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import javaapplication3.Persona;
import java.util.Scanner;

/**
 *
 * @author esqui
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //TODO code application logic here
        Scanner scan = new Scanner(System.in); 
        Persona persona = new Persona();
        
        System.out.println("Ingrese los nombre de la persona: ");
        persona.setNombre(scan.next());
        System.out.println("Ingrese la edad de la persona: ");
        persona.setEdad(scan.nextInt());
        System.out.println("Ingrese el numero de telefono de la persona: ");
        persona.setTelefono(scan.next());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("--------------------------");
        System.out.println("Nombre de la persona es: "+ persona.getNombre());
        System.out.println("La edad de la persona es: "+ persona.getEdad());
        System.out.println("Numero de telefono de la persona es: "+ persona.getTelefono());
        
        
    }
    
}
