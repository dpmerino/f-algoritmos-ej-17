/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.docente;
import institucion.Asignatura;
/** 
 * @author diegomerino
 */
public class Docente {
    private String nombre;
    private String apellido;
    private Titulo tit_tercer_nivel;
    private Titulo tit_cuarto_nivel;
    private Asignatura asignatura_1;
    private Asignatura asignatura_2;   
        public void establecer_nombre (String n){
            nombre = n;
        }
        public String obtener_nombre (){
            return nombre;
        }
        public void establecer_apellido(String a){
            apellido = a;
        }
        public String obtener_apellido(){
            return apellido;
        }
        public void establecer_tit_tercer_nivel(Titulo n){
            tit_tercer_nivel = n;
        }
    
        public Titulo obtener_tit_tercer_nivel(){
            return tit_tercer_nivel;
        }
    
        public void establecer_tit_cuarto_nivel(Titulo n){
            tit_cuarto_nivel = n;
        }
    
        public Titulo obtener_tit_cuarto_nivel(){
            return tit_cuarto_nivel;
        }
    
        public void establecer_asignatura_1(Asignatura n){
            asignatura_1 = n;
        }
    
        public Asignatura obtener_asignatura_1(){
            return asignatura_1;
        }
    
        public void establecer_asignatura_2(Asignatura n){
            asignatura_2 = n;
        }
    
        public Asignatura obtener_asignatura_2(){
            return asignatura_2;
        }
    
        public String toString(){
            String cadena = String.format("Datos del Docente\n"
                    + "Nombres: %s\n"
                    + "Apellidos: %s\n"
                    + "Tiene a su cargo las asignaturas:\n"
                    + "\t\tAsignatura 1: %s\n"
                    + "\t\tAsignatura 2: %s\n"
                    + "El docente tiene los siguiente títulos"
                    + " académicos\n"
                    + "\t\tTítulo 3er nivel: %s\n"
                    + "\t\tTítulo 3er nivel: %s", obtener_nombre(),
                    obtener_apellido(),
                    obtener_asignatura_1(), obtener_asignatura_2(),
                    obtener_tit_tercer_nivel(), obtener_tit_cuarto_nivel());
            return cadena;
         }

    }

