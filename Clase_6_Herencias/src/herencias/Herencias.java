/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;
import herencias4.*;
/**
 *
 * @author reroes
 */
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Estudiante e = new Estudiante("René", "Elizalde", 33, 100.2);
        //System.out.println(e);
        
        //Estudiante e1 = new Estudiante("Diego","Merino", 15, 123.12);
        //System.out.println(e1);
        Asignatura_Presencial ArrayA1[]= new Asignatura_Presencial[2];
        ArrayA1[0]= new Asignatura_Presencial ("Programacion","Comun",100,180);
        ArrayA1[1]= new Asignatura_Presencial ("Literatura","Troncal",300,200);
        Estudiante e = new Estudiante("Rene","Elizalde",34,ArrayA1);
        System.out.println(e);
        
    }
    
}
