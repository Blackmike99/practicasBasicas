/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author m1gue
 */
public class Docente extends Persona{
    private int horas;
    private double pagoHora;
    private double salario;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void calcularSalario(){
        setSalario(getPagoHora()*getHoras());
    }
    
    public void evaluarAlumno(Alumno objAl,double calMat, double calFis, double calPro){
        objAl.setCalMate(calMat);
        objAl.setCalMate(calFis);
        objAl.setCalMate(calPro);
        objAl.obtenerPromedio();;
    }
    
    @Override
    public String mostrarInfo(){
        String info=super.mostrarInfo();
        info+="Horas impartidas: "+getHoras()+"\n"+
              "Pago por hora: "+getPagoHora()+"\n"+
              "Salario: "+getSalario()+"\n";
        return info;
    }
}
