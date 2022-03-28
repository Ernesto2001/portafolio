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
public class cliente {
    
    public cliente(){
    
    }
    public static void main(String []args){
        Scanner lectura = new Scanner (System.in);

System.out.println("INGRESE EL NOMBRE DEL CLIENTE: ");

String marca = lectura.next();
System.out.println("INGRESE EL APELLIDO DEL CLIENTE: ");

String modelo = lectura.next();

System.out.println("INGRESE EL GENERO:");
String sexo=lectura.next();
    
String numCadena = "1";

int numEntero = Integer.parseInt(numCadena);
System.out.println("INGRESE EL DUI DEL CLIENTE:");
String numcadena=lectura.next();

System.out.println("DATOS GUARDADOS CON EXITO");
       //System.out.println(""+marca);
    }

   
    }

        
        
    
  
    

