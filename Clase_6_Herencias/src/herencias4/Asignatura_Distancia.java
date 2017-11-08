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
public class Asignatura_Distancia extends Asignatura {
    private int numero_creditos;
    
    public Asignatura_Distancia(String n,String t,double c,int cr){
        super(n,t,c);
        setCreditos(cr);
    }
    public void setCreditos(int h){
        numero_creditos = h;
    }
    public int getCreditos(){
        return numero_creditos;
    }
    @Override
     public String toString(){
        return String.format("%sNumero creditos:%d",super.toStrin(),getCreditos());
    }
}
