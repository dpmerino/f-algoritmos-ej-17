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
public class Asignatura_Presencial extends Asignatura {
    private int numero_horas;
    
    public Asignatura_Presencial(String n,String t,double c, int h){
        super(n,t,c);
        setHoras(h);
    }
    public void setHoras(int h){
        numero_horas = h;
    }
    public int getHoras(){
        return numero_horas;
    }
    @Override
    public String toString(){
        return String.format("%sNumero horas:%d",super.toStrin(),getHoras());
    }
    
}
