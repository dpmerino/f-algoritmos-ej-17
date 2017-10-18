/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion;

/**
 *
 * @author diegomerino
 */
public class Asignatura {
    private String nombre;
    private int creditos;
    
        public void establecer_nombre(String v){
            nombre = v;
        }
        public String obtener_nombre(){
            return nombre;
        }
        public void establecer_creditos(int x){
            creditos = x;
        }
        public int obtener_creditos(){
            return creditos;
        }
}
