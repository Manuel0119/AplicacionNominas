/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ud06a01;

import java.util.Comparator;

/**
 *
 * @author daw1
 */
public class ComparadorSueldo implements Comparator<Empleado>{

    /**
     * Método que nos permite comparar los sueldos de dos empleados.
     * @param e1 empleado 1.
     * @param e2 empleado 2.
     * @return 0 si ambos empleados tienen el mismo sueldo, -1 si el sueldo del primer empleados es menor que la del segundo y 1 si el sueldo del primer empleado es mayor que la del segundo empleado. 
     */
    @Override
    public int compare(Empleado e1, Empleado e2) {
        int salida=0;
        float sueldo1, sueldo2;
        
        sueldo1=e1.ingresos();
        sueldo2=e2.ingresos();
            
        if(sueldo1 < sueldo2){
            salida=-1;
        }
        else{
            if(sueldo1 > sueldo2){
               salida=1;  
            }
        }
        return salida;
    }
    
}
