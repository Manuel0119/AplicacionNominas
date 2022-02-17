/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ud06a01;

/**
 *
 * @author daw1
 */
public class EmpleadoFijo extends Empleado{

    private float salario;

    /**
     *
     */
    public EmpleadoFijo() {
    }
    
    /**
     * Constructor que reutiliza atributos del constructor de la clase padre Empleado, incluyendo el salario del empleado fijo.
     * @param dni dni del empleado fijo.
     * @param nombre nombre del empleado fijo.
     * @param salario salario del empleado fijo.
     */
    public EmpleadoFijo(String dni, String nombre, float salario) {
        super(dni, nombre);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString()+","+salario; 
    }

    /**
     * Método que devuelve los ingresos de un empleado fijo. 
     * @return ingresos de un empleado fijo.
     */
    @Override
    public float ingresos() {
        return salario;
    }

    /**
     * Método que devuelve el salario de un empleado fijo.
     * @return salario de un empleado fijo.
     */
    public float getSalario() {
        return salario;
    }

    /**
     * Método que establece el salario de un empleado fijo.
     * @param salario salario de un empleado fijo.
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
       
}
