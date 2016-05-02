/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tacomposite;

import java.util.ArrayList;

/**
 *
 * @author rn_dr
 */
public class Composite implements ISueldo {
    private ArrayList<ISueldo> empleado = new ArrayList<ISueldo>();

    @Override
    public double getSueldo() {
        double sumador = 0;
        for(int i = 0; i<empleado.size(); i++){
            sumador = sumador + empleado.get(i).getSueldo();
        }
        return sumador;
    }
    
    public void agregar(ISueldo p){
        empleado.add(p);
    }
   
}
