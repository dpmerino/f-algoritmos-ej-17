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
public class Estudiante extends Persona{
    private Asignatura_Presencial[] asignaturas;
    public Estudiante(String n, String a, int e, Asignatura_Presencial[] as){
        super(n, a, e);
        setAsignaturas(as);
    }
    
    public void setAsignaturas(Asignatura_Presencial[] as){
        asignaturas = as;
    }
    public Asignatura[] getAsignaturas(){
        return asignaturas;
    }
    public double getValorMatricula(){
        double valor = 0;
        for(Asignatura asignaturas : asignaturas){
            valor+=asignaturas.getCosto();
        }
        return valor;
    }
    public String getAsignatura(){
        String cadena ="" ;
        for(Asignatura asignaturas : asignaturas){
            cadena += asignaturas.getNombre()+"\n";
        }
        return cadena;
    }
    @Override
    public String toString(){
    
        return String.format("%s\n"
                + "Costo Matricula:$ %f\n"
                + "Lista de Asignaturas:\n %s\n", super.toString(),getValorMatricula(),getAsignatura());
    }
    
    
    // @Override
    // public String toString(){
    
    //    return String.format("%s - %f", getApellido(), getMatricula());
    // }
}
