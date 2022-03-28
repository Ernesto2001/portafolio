/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HERENCIAS;

/**
 *
 * @author ernes
 */
public class datosvehiculo {
    public class vehiculo{
        //TOMA DE DATOS DE LOS VEHICULOS
        protected String marca;
        protected String modelo;
        private int año;

        /**
         *
         * @param marca
         * @param modelo
         * @param año
         */
        public vehiculo(String marca, String modelo, int año) {
            this.marca=marca;
            this.modelo=modelo;
            this.año=año;
        }
         /**
         *
         * @return
         */
       public String getmarca(){
        return marca;
    }
    public void setmarca(String marca){
    this.marca=marca;
    
    
        }
      public String getmodelo(){
        return modelo;
    }
    public void setmodelo(String modelo){
    this.modelo=modelo;
    }
      public int getaño(){
        return año;
    }
    public void setaño(int año){
    this.año=año;
}
    }
}

