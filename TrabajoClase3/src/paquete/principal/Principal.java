/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.principal;
import institucion.Asignatura;
import personal.docente.*;
/**
 *
 * @author diegomerino
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Asignatura a1 = new Asignatura();
        a1.establecer_nombre("Matemáticas");
        a1.establecer_creditos(8);
        
        Asignatura a2 = new Asignatura();
        a2.establecer_nombre("Física");
        a2.establecer_creditos(6);
        
        Titulo t1 = new Titulo();
        t1.establecer_nombre("Licenciado en Físico Matemáticas");
        t1.establecer_nombre_universidad("Universidad Politécnica");
        
        Titulo t2 = new Titulo();
        t2.establecer_nombre("Magister en Docencia Matemática");
        t2.establecer_nombre_universidad("Universidad Valenciana");
        
        Docente docente = new Docente();
        docente.establecer_nombre("Luis V");
        docente.establecer_apellido("Perez J");
        docente.establecer_asignatura_1(a1);
        docente.establecer_asignatura_2(a2);
        docente.establecer_tit_tercer_nivel(t1);
        docente.establecer_tit_cuarto_nivel(t2);
        System.out.println(docente);
    }
    
}
