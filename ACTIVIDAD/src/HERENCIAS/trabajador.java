/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HERENCIAS;

import java.util.Scanner;

/**
 *
 * @author ernes
 */
public class trabajador extends datos {
    public trabajador(){}
    public static void main(String []args){
    Scanner lectura = new Scanner (System.in);
    System.out.println("INGRESE EL NOMBRE: ");

    String marca = lectura.next();
   
    String numCadena = "1";

    int numEntero = Integer.parseInt(numCadena);
    System.out.println("INGRESE EL CODIGO DE TRABAJADOR:");
    String numcadena=lectura.next();
   
   System.out.println("DATOS GUARDADOS CON EXITO!");
       
    
    }

    
}

