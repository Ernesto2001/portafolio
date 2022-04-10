/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadd;

import java.util.Date;

/**
 *
 * @author ernes
 */
public class trabajador extends datos{
    //constructor de trabajador
    public trabajador(String nombre,String apellido,Date nacimiento,char sexo,int dui){
        super(nombre,apellido,nacimiento,sexo,dui);
        
    
    }
    public void mostrar_Datos(){
    System.out.println("Nombre:"+nombre+
            "\nApellido:"+apellido+
            "\nNacimiento:"+nacimiento+
            "\nSexo:"+sexo+
            "\nDui:"+dui);
    }
    
}
