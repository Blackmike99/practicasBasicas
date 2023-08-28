/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author m1gue
 */
public class principalFecha {
    public static void main(String[] args){
        int menu;
        Scanner in=new Scanner(System.in);
        do{
         Fecha objFecha=new Fecha();
         objFecha.leerFecha();
         System.out.println(objFecha.imprimirFechaCorta());
         System.out.println(objFecha.imprimirFechaLarga());
         System.out.println("Que desea hacer 1)Ingresar otra fecha  2)salir");
         menu=in.nextInt();
        }while(menu!=2);
     }
}
