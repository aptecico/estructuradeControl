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
        
        //estructura de control
        
        switch(opcion){
            case 1:
                //solicitar los numero de la suma
                Scanner lectura=new Scanner(System.in);
                System.out.println("Ingrese primer número");
                numero1=lectura.nextInt();
                System.out.println("Ingrese segundo número");
                numero2=lectura.nextInt();
                //opracion matematica
                resultado=numero1+numero2;
                System.out.println("La suma de "+numero1+"+"
                        +numero2+"="+resultado);
                
                
            break;
            
            case 2:
                Scanner lec=new Scanner(System.in);
                System.out.println("Ingrese mensaje a mostrar");
                mensaje=lec.next();
                System.out.println("El mensaje que ingreso es: "
                        + mensaje);
                break;
            
            default:
                System.out.println("Opción no válida");
            break;
        }
    }
    
}
