/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author m1gue
 */
public class Alumno extends Persona{
    private String carrera;
    private double calMate;
    private double calFisica;
    private double calProgra;
    private double promedio;

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getCalMate() {
        return calMate;
    }

    public void setCalMate(double calMate) {
        this.calMate = calMate;
    }

    public double getCalFisica() {
        return calFisica;
    }

    public void setCalFisica(double calFisica) {
        this.calFisica = calFisica;
    }

    public double getCalProgra() {
        return calProgra;
    }

    public void setCalProgra(double calProgra) {
        this.calProgra = calProgra;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    public void obtenerPromedio(){
        setPromedio((getCalMate()+getCalFisica()+getCalProgra())/3);
    }
    
    @Override
    public String mostrarInfo(){
        String info=super.mostrarInfo()+"\n";
        info+="Carrera: "+getCarrera()+"\n"+
              "Matemáticas: "+getCalMate()+"\n"+
              "Física: "+getCalFisica()+"\n"+
              "Programacion: "+getCalProgra()+"\n"+
              "Promedio: "+getPromedio()+"\n";
        return info;
    }
}
