/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author m1gue
 */
public class principalVolumen {
    public static void main(String[] args){
         Figura objVol=new Figura();
         objVol.leerMedidas();
         objVol.obtenerVolumen();
         System.out.println(objVol.imprimirMedidas());
     }
}
