/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ud06a01;

import java.util.Objects;

/**
 *
 * @author daw1
 */
public abstract class Empleado implements Comparable<Empleado>{
    private String dni;
    private String nombre;

    /**
     * Constructor vacío de la clase Empleado.
     */
    public Empleado(){}

    /**
     * Constructor que inicializa los atributos del dni y el nombre del empleado a su valor por defecto.
     * @param dni dni del empleado.
     * @param nombre nombre del empleado.
     */
    public Empleado(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    
    /**
     * Método que devuelve una cadena con el dni y el nombre del empleado.
     * @return cadena con el dni y el nombre del empleado.
     */
    @Override
    public String toString() {
        return dni +","+ nombre;
    }
    
    /**
     * Método que nos permite comparar dos empleados por su dni.
     * @param empleado empleados del sistema de nóminas.
     * @return un entero negativo, cero o un entero positivo, ya que este objeto es menor, igual o mayor que el objeto especificado.
     */
    @Override
    public int compareTo(Empleado empleado) {
        return this.dni.compareTo(empleado.dni);
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if(obj instanceof Empleado){
            final Empleado other = (Empleado) obj;
            if (this.dni.equals(other.dni)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método que devuelve el dni de un empleado.
     * @return dni del empleado solicitado.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Método que establece el dni de un empleado.
     * @param dni dni del empleado.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Método que devuelve el nombre de un empleado.
     * @return nombre del empleado solicitado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre de un empleado 
     * @param nombre nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método abstracto que devuelve los ingresos de un empleado.
     * @return ingresos de un empleado.
     */
    public abstract float ingresos();
        
}
