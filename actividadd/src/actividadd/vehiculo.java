
package actividadd;




import java.util.Date;


public abstract class vehiculo extends datos_vehiculos{
    //constructor de vehiculo
  public  vehiculo(String placa, String marca, String modelo, Date ingreso){
        super(placa,marca,modelo,ingreso);
  }      
    
   
    public void mostrar_Datos(){
    System.out.println("Placa:"+placa+
            "\nMarca:"+marca+
            "\nModelo:"+modelo+
            "\nIngreso:"+ingreso
            );
    }
    
}
