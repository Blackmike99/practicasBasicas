/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author m1gue
 */
public class Figura {
    private double largo;
    private double ancho;
    private double alto;
    private double volumen;

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen() {
    }
    
    public void leerMedidas(){
        Scanner in=new Scanner(System.in);
        System.out.println("Ingresa el alto");
        setAlto(in.nextDouble());
        System.out.println("Ingresa el ancho");
        setAncho(in.nextDouble());
        System.out.println("Ingresa el largo");
        setLargo(in.nextDouble());
    }
    public void obtenerVolumen(){
        this.volumen =getAlto()*getLargo()*getAncho();
    }
    
    public String imprimirMedidas(){
        String medidas="Alto: "+getAlto()+"\n"+
                           "Ancho: "+getAncho()+"\n"+
                           "Largo: "+getLargo()+"\n"+
                           "volumen: "+getVolumen();
        return medidas;
    }
}
