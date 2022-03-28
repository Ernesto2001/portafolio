/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HERENCIAS;

import java.util.Date;

/**
 *
 * @author ernes
 */
public class datos {
     public class persona{
        //TOMA DE DATOS DEL CLIENTE
        protected String nombre;
        private String apellido;
        private Date nacimiento;
        private char sexo;
        private int dui;
        
        //TOMA DE DATOS DE LOS VEHICULOS
        //private String marca;
        //private String modelo;
        //private int año;
        //TOMA DE DATOS DEL TRABJADOR
        private int codigo_trabajador;
        
        
        public persona(String nombre, String apellido, Date nacimiento, char sexo, int dui) {
            this.nombre=nombre;
            this.apellido=apellido;
            this.dui=dui;
            this.sexo=sexo;
            this.nacimiento=nacimiento;
            this.codigo_trabajador=codigo_trabajador;
        //public vehiculo(String marca,String modelo,int año)
}

        /**
         *
         * @return
         */
        public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
    this.nombre=nombre;
    }    
    public String getapellido(){
        return apellido;
    }
    public void setapellido(String apellido){
    this.apellido=apellido;
    }  
    public Date getfecha(){
        return nacimiento;
    }
    public void setfecha(Date nacimiento){
    this.nacimiento=nacimiento;
    }  
    public char getsexo(){
        return sexo;
    }
    public void setsexo(char sexo){
    this.sexo=sexo;
    }  
    public int getdui(){
        return dui;
    }
    public void setdui(int dui){
    this.dui=dui;
    }  
    public int getcodigo_trabajador(){
        return codigo_trabajador;
    }
    public void setcodigotrabajador(int codigotrabajador){
    this.codigo_trabajador=codigo_trabajador;
    }
     }
      
      }
     

       
        
     
     
         
    
    
    

        

      
  
    
            
    
    
    
    
          

