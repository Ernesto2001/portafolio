
package actividadd;

import java.util.Date;


public  class datos_vehiculos {
    
        //TOMA DE DATOS DEL VEHICULO
        protected String placa;
        protected String marca;
        protected String modelo;
        protected Date ingreso;
        
        public datos_vehiculos (String placa, String marca,String modelo, Date ingreso ) {
            this.placa=placa;
            this.marca=marca;
            this.modelo=modelo;
            this.ingreso=ingreso;
}        
        

public String getplaca(){
        return placa;
    }
    public void setplaca(String placa){
    this.placa=placa;
    }  
    public String getmarca(){
        return marca;
    }
    public void setfecha(String marca){
    this.marca=marca;
    }  
    public String gemodelo(){
        return modelo;
    }
    public void setmodelo(String modelo){
    this.modelo=modelo;
    }  
    public Date getingreso(){
        return ingreso;
    }
    public void setingreso(Date ingreso){
    this.ingreso=ingreso;
    }  
    

    
}

