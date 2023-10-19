/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author m1gue
 */
public class PrinipalEscuela {
    public static void main(String[] args) {
        Alumno objAl=new Alumno();
        Docente objDoc=new Docente();
        
        objAl.setNombre("Dil Dominguez");
        objAl.setEdad(20);
        objAl.setCorreo("Lol1Destroyer@gmail.com");
        objAl.setCodigo("1234567");
        objAl.setCarrera("IDS");
        
        objDoc.setNombre("Chalino Lopez");
        objDoc.setEdad(40);
        objDoc.setCorreo("pedropascal@gmail.com");
        objDoc.setCodigo("5467890");
        objDoc.setHoras(20);
        objDoc.setPagoHora(200);
        
        objDoc.calcularSalario();
        objDoc.evaluarAlumno(objAl, 87, 50, 90);
        
        System.out.println(objAl.mostrarInfo());
        System.out.println("------------------------");
        System.out.println(objDoc.mostrarInfo());
        
        
    }
}
