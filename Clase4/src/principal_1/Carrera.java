/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal_1;



/**
 *
 * @author Salas
 */
public class Carrera {
    private String nombre;
    private String modalidad;
    
    public void establecer_nombre (String n){
        nombre = n;
    }
    public String obtener_nombre(){
        return nombre;
    }
    public void establecer_modalidad (String m){
        modalidad = m;
    }
    public String obtener_modalidad(){
        return modalidad;
    }   
    public Carrera (){
        modalidad = "Distancia";
    }
    public Carrera (String md){
        modalidad = md;
    }
    public Carrera (String md, String x){
        modalidad = md;
        nombre = x;
    }
    
    @Override
    public String toString(){
       String cadena;
       cadena = String.format("Carrera: %s\n"
               + "Modalidad: %s\n",obtener_nombre(),obtener_modalidad());
       return cadena;
    }
}
