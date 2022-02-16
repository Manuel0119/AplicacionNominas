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
     *
     * @param dni
     * @param nombre
     * @param salario
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
     *
     * @return
     */
    @Override
    public float ingresos() {
        return salario;
    }

    /**
     *
     * @return
     */
    public float getSalario() {
        return salario;
    }

    /**
     *
     * @param salario
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
       
}
