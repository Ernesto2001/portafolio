
package actividadd;

import java.util.Date;


public class cliente extends datos {
    //constructor de cliente
    public cliente(String nombre,String apellido,Date nacimiento,char sexo,int dui){
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
