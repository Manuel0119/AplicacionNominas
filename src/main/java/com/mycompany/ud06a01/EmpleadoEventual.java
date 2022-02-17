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
public class EmpleadoEventual extends Empleado{
    
    private float salarioHora;
    private int horas;

    /**
     * Constructor vacío de la clase EmpleadoEventual.
     */
    public EmpleadoEventual() {
    }

    /**
     * Constructor que reutiliza atributos del constructor de la clase padre Empleado, incluyendo el salario por hora del empleado eventual y las horas que trabaja.
     * @param dni dni del empleado eventual.
     * @param nombre nombre del empleado eventual.
     * @param salarioHora salario que cobra por hora el empleado eventual.
     * @param horas horas que trabaja el empleado eventual.
     */
    public EmpleadoEventual(String dni, String nombre, float salarioHora, int horas) {
        super(dni, nombre);
        this.salarioHora = salarioHora;
        this.horas = horas;
    }

    @Override
    public String toString() {
        return super.toString()+","+salarioHora+","+horas;
    }

    /**
     * Método que devuelve los ingresos de un empleado eventual. 
     * @return el resultado de multiplicar el salario hora por el número de horas de trabajo.
     */
    @Override
    public float ingresos() {
        return salarioHora*horas;
    }

    /**
     * Método que devuelve el salario por hora de un empleado eventual.
     * @return salario por hora de un empleado eventual.
     */
    public float getSalarioHora() {
        return salarioHora;
    }

    /**
     * Método que establece el salario por hora de un empleado eventual.
     * @param salarioHora salario por hora de un empleado eventual.
     */
    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }

    /**
     * Método que devuelve las horas de trabajo de un empleado eventual.
     * @return horas de trabajo de un empleado eventual.
     */
    public int getHoras() {
        return horas;
    }

    /**
     * Método que establece las horas que trabaja un empleado eventual.
     * @param horas horas de un empleado eventual.
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }
  
}
