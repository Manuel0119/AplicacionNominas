/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ud06a01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/**
 *
 * @author daw1
 */
public class SistemaNominas{
    private TreeMap<String,Empleado> empleados;

    /**
     * Constructor que crea una mapa con los empleados.
     */
    public SistemaNominas() {
        empleados=new TreeMap<>();
    }

    /**
     * Método que devuelve los empleados en forma de mapa.
     * @return mapa con los empleados creados.
     */
    public TreeMap<String,Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * Método que establece los empleados en un mapa.
     * @param empleados empleados del sistema de nóminas.
     */
    public void setEmpleados(TreeMap<String,Empleado> empleados) {
        this.empleados = empleados;
    }
    
    /**
     * Método que permite incluir empleados según su dni.
     * @param empleado empleados del sistema de nóminas.
     * @return true si se ha incluido el empleado con éxito.
     */
    public boolean incluirEmpleado(Empleado empleado){
        return (empleados.putIfAbsent(empleado.getDni(), empleado)==null);
    }

    /**
     * Método que devuelve un empleado en función del dni introducido.
     * @param dni dni del empleado.
     * @return empleado en función del dni introducido.
     */
    public Empleado getEmpleado(String dni){
        return empleados.get(dni);
    }

    /**
     * Método que nos permite eliminar un empleado.
     * @param empleado empleados del sistema de nóminas.
     * @return true si se ha eliminado el empleado con éxito. 
     */
    public boolean eliminarEmpleado(Empleado empleado){
        return (empleados.remove(empleado.getDni())!=null);
    }
    
    /**
     * Método que devuelve una lista de empleados. 
     * @return Lista de empleados.
     */
    public List<Empleado> listarEmpleados(){
        return new ArrayList<>(empleados.values());
    }
    
    /**
     * Método que devuelve una lista de empleados ordenándolos por su sueldo.
     * @return Lista de empleados ordenada por su sueldo.
     */
    public List<Empleado> listarEmpleadosPorSueldo(){
        List<Empleado> salida=new ArrayList<>(empleados.values());
        
        Collections.sort(salida, new ComparadorSueldo());
        
        return salida;
    }

    /**
     * Método que devuelve el total de depósitos de los empleados.
     * @return Total de depositos de los empleados.
     */
    public float getTotalDepositos(){
        float acumulador=0;
        for(Empleado c : empleados.values()){
            acumulador+=c.ingresos();
        }
        return acumulador;
    }
 
}

