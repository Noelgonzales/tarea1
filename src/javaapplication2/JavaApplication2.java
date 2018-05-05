/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

class Alumno
{
    String nombre;
    int nota1;
    int nota2;
    
    void establecernombre (String nombre)
    {
    this.nombre = nombre;    
    }
    int promedio()
    {
        int suma = nota1 + nota2;
        return suma/2;
    }
}
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Alumno alumno = new Alumno();
       //alumno.nombre = "Juan ";
       alumno.establecernombre("Juan");
       alumno.nota1 =70;
       alumno.nota2=80;
       System.out.print("El Promedio es:  " + alumno.promedio());
             
     
      
    }
    
}
