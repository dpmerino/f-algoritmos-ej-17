/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias4;

/**
 *
 * @author diegomerino
 */
public class Principal {
    public static void main(String[] args) {
        Asignatura_Distancia AD = new Asignatura_Distancia("Programaciion","Común",100,6);
        System.out.println(AD);
        
        Asignatura_Presencial AP = new Asignatura_Presencial("Literatura","Troncal",300,180);
        System.out.println(AP);
    }
}
