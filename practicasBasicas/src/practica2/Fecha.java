/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author m1gue
 */
public class Fecha {
    
    private int dia;
    private int mes;
    private int año;
            
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia<1||dia>31){
            System.out.println("Introduce una fecha congruente\n");
            leerFecha();
        }
        else{
        this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes<1||mes>12){
            System.out.println("Introduce una fecha congruente\n");
            leerFecha();
        }
        if(mes==2||mes==4||mes==6||mes==9||mes==11){
            if(mes==2){
                if(dia>29){
                    System.out.println("Introduce una fecha congruente");
                    leerFecha();
                }
                else{
                    this.mes = mes;
                }
            }
            else{
                if(dia>30){
                    System.out.println("Introduce una fecha congruente");
                    leerFecha();
                }
                else{
                    this.mes = mes;
                }
            }
        }
        else{
        this.mes = mes;
        }
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        int bisiesto;
        if(año>=1){
        if(año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)){
            bisiesto=1;
        }
        else{
            bisiesto=0;
        }
        if(bisiesto==0&&dia>28&&mes==2){
            System.out.println("No es un año bisiesto, introduce la fecha nuevamente\n");
                    leerFecha();
        }
        else{
            this.año=año;
        }
        }
        else{
            System.out.println("Introduce una fecha congruente");
            leerFecha();
        }
    }
    
    public int getB(){
        int bisiesto=0;
        if(año % 4 == 0 &&(año % 100 != 0 || año % 400 == 0)){
        bisiesto=1;
    }
        return bisiesto;
    }
    
    public void leerFecha(){
        Scanner in=new Scanner(System.in);
        System.out.println("\nIngresa el día");
        setDia(in.nextInt());
        System.out.println("Ingresa el mes");
        setMes(in.nextInt());
        System.out.println("Ingresa el año");
        setAño(in.nextInt());
    }
    public String imprimirFechaCorta(){
        String fecha="\n"+getDia()+"/"
                        +getMes()+"/"
                           +getAño();
        if(getB()==1){
            fecha=fecha+" año bisiesto\n";
            }
        return fecha;
}

public String imprimirFechaLarga(){
    String mes="";
    switch(getMes()){
        case 1:
            mes="enero";
            break;
        case 2:
            mes="febrero";
            break;
        case 3:
            mes="marzo";
            break;
        case 4:
            mes="abril";
            break;
        case 5:
            mes="mayo";
            break;
        case 7:
            mes="julio";
            break;
        case 8:
            mes="agosto";
            break;
        case 9:
            mes="septiembre";
            break;
        case 10:
            mes="octubre";
            break;
        case 11:
            mes="noviembre";
            break;
        case 12:
            mes="diciembre";
            break;
    }
        String fecha=getDia()+" de "
                        +mes+" del año "
                           +getAño();
        if(getB()==1){
            fecha=fecha+" año bisiesto\n";
            }
        return fecha;
}
}