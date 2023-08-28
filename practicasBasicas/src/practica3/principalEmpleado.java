/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

import java.util.Scanner;

/**
 *
 * @author m1gue
 */
public class principalEmpleado {
    public static void main(String[] args){
        int menu;
        Scanner in=new Scanner(System.in);
        do{
         nombradoEmpleado objEmpleado=new nombradoEmpleado();
         objEmpleado.capturarDatosTrabajador();
         System.out.println(objEmpleado.imprimirDatosTrabajador());
         System.out.println("Que desea hacer 1)Ingresar otro empleado  2)salir");
         menu=in.nextInt();
        }while(menu!=2);
     }
}
