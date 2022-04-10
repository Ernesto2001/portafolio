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
public abstract class datos {
    //TOMA DE DATOS DEL CLIENTE/TRABAJADOR
        protected String nombre;
        protected String apellido;
        protected Date nacimiento;
        protected char sexo;
        protected int dui;
        
        public datos (String nombre, String apellido, Date nacimiento, char sexo, int dui) {
            this.nombre=nombre;
            this.apellido=apellido;
            this.dui=dui;
            this.sexo=sexo;
            this.nacimiento=nacimiento;
}

       
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
    
    
    }
    
    

