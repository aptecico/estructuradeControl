/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuradecontrol;

import java.util.Scanner;

/**
 *
 * @author German
 */
public class EstructuradeControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            1. Operación matematica
            2. Imprmir en pantalla
            3. Número random
            4. Salir
        */
        //declarion de varibales
        int numero1=0;
        int numero2=0;
        int resultado=0;
        int opcion=0;
        String teclado="";
        int aleatorio=0;
        String mensaje="";
        
        //imprimir el menu de opciones
        System.out.println("1. Opreacion matematica");
        System.out.println("2. Imprimir en pantalla");
        System.out.println("3. Número random");
        System.out.println("4. Salir");
        System.out.print("Ingrese opcion: ");
        //leer por teclado
        Scanner sn =new Scanner(System.in);
        opcion=sn.nextInt();
        
    }
    
}
