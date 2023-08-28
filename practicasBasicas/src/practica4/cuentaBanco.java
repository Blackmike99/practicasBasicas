/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

import java.util.Scanner;

/**
 *
 * @author m1gue
 */
public class cuentaBanco {
    private String nombreC;
    private String numeroC;
    private double saldoC;

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getNumeroC() {
        return numeroC;
    }

    public void setNumeroC(String numeroC) {
        this.numeroC = numeroC;
    }

    public double getSaldoC() {
        return saldoC;
    }

    public void setSaldoC(double saldoC) {
        this.saldoC = saldoC;
    }
    
    public void capturarDatos(){
        
        Scanner in=new Scanner(System.in);
        System.out.println("\nIngresa el Nombre: ");
        setNombreC(in.nextLine());
        System.out.println("Ingresa su numero de cuenta: ");
        setNumeroC(in.nextLine());
        System.out.println("Ingresa el saldo: ");
        setSaldoC(in.nextDouble());
    }
    public void abonarCuenta(){
        double x=0;
        Scanner in =new Scanner(System.in);
        System.out.println("\nIngresa el saldo a depositar: ");
        x=in.nextDouble();
        saldoC=saldoC+x;
        System.out.println("Su saldo actual es de: "+saldoC+"\n");
    }
    
    public void retirarCuenta(){
        double x=0;
        Scanner in =new Scanner(System.in);
        System.out.println("\nIngresa el saldo a retirar: ");
        x=in.nextDouble();
        if(x>saldoC){
            System.out.println("""
                               No hay sufieciente saldo: 
                               saldo actual: """+saldoC+"\n");
        }
        else{
        saldoC=saldoC-x;
        System.out.println("Su saldo actual es de: "+saldoC+"\n");
        }
    }
    
    public String imprimirDatos(){
        String cuenta="\nDatos de la cuenta: \nNombre: "+getNombreC()+"\n"
                        +"numero de cuenta: "+getNumeroC()+"\n"
                           +"Saldo: "+getSaldoC()+"\n";
        return cuenta;
}
    
    public void mostrarMenu(){
        int x=0;
        Scanner in =new Scanner(System.in);
        do{
        System.out.println("""
                           
                           1)Crear la cuenta bancaria
                           2)Imprimir datos de la cuenta bancaria
                           3)Abonar a la cuenta bancaria
                           4)Retirar de la cuenta bancaria
                           5)Salir 
                           """);
        x=in.nextInt();
        switch(x){
            case 1:
                capturarDatos();
                break;
            case 2:
                System.out.println(imprimirDatos());
                break;
            case 3:
                abonarCuenta();
                break;
            case 4:
                retirarCuenta();
                break;
            case 5:
                System.out.println("Que tenga un buen dia");
                break;
            default:
                System.out.println("Ingrese otra opcion");
                break;
        }
        }while(x!=5);
    }
    
}

