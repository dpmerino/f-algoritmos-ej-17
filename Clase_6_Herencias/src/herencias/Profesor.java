/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author diegomerino
 */
public class Profesor extends Persona {
    private double sueldo;
    
    public Profesor(double s){
        super("Rene","Elizalde",34);
        setSueldo(s);
    }
    public Profesor(String n, String a, int ed, double s){
        super(n,a,ed);
        setSueldo(s);
    }
    public Profesor(){
        super ("Diego","Merino",22);
        setSueldo(12313.1);
    }
    @Override
    public void setEdad(int e){
        if (edad<30) {
            edad = 30;
        }
        else{
            edad=e;
        }
 
    }
    public void setSueldo(double s){
        sueldo =s;
    }
    public double getSueldo(){
        return sueldo;
    }
    @Override
    public String toString(){
    
        return String.format("%s - %f", super.toString(), getSueldo());
    }
}
