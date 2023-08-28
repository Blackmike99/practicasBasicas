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
public class nombradoEmpleado {
    private String nombre;
    private String puesto;
    private double pagoHora;
    private double horasTrabajadasMes;
    private double salarioMensual;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }

    public double getHorasTrabajadasMes() {
        return horasTrabajadasMes;
    }

    public void setHorasTrabajadasMes(double horasTrabajadasMes) {
        this.horasTrabajadasMes = horasTrabajadasMes;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
    
    public void capturarDatosTrabajador(){
        Scanner in=new Scanner(System.in);
        System.out.println("\nIngresa el Nombre del trabajador: ");
        setNombre(in.nextLine());
        System.out.println("Ingresa su Puesto: ");
        setPuesto(in.nextLine());
        System.out.println("Ingresa el pago por hora");
        setPagoHora(in.nextDouble());
        System.out.println("Ingresa las horas trabajadas en el mes");
        setHorasTrabajadasMes(in.nextDouble());
    }
    
    public double obtenerSalarioMensual(){
        double salario=0;
        if(horasTrabajadasMes>=100&&horasTrabajadasMes<=200){
            salario=(pagoHora*horasTrabajadasMes*1.1);
        }
        if(horasTrabajadasMes>=201&&horasTrabajadasMes<=220){
            salario=(pagoHora*horasTrabajadasMes)*1.2;
        }
        if(horasTrabajadasMes>=221&&horasTrabajadasMes<=230){
            salario=pagoHora*horasTrabajadasMes*1.3;
        }
        if(horasTrabajadasMes<100){
            salario=pagoHora*horasTrabajadasMes;
        }
        salario=salario*0.84;
        return salario;
    }
    
    public String imprimirDatosTrabajador(){
        String salario="\nDatos del trabajador\nNombre: "+getNombre()+"\n"
                        +"Puesto: "+getPuesto()+"\n"
                           +"Horas trabajadas este mes: "+getHorasTrabajadasMes()+"\n"
                                +"Pago por hora: "+getPagoHora()+"\n"
                                    +"Pago del mes: "+obtenerSalarioMensual();
        return salario;
}
    
}
