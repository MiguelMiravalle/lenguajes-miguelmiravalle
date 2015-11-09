/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.io.Serializable;

/**
 *
 * @author Spartan0117
 */
public class Empleado implements Serializable {
    private String nombre;
    private String paterno;
    private long seguroSocial;
    private float sueldoBase;
    private int horasExtra;

    public Empleado(String nombre, String paterno, long seguroSocial, float sueldoBase, int horasExtra) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.seguroSocial = seguroSocial;
        this.sueldoBase = sueldoBase;
        this.horasExtra = horasExtra;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the paterno
     */
    public String getPaterno() {
        return paterno;
    }

    /**
     * @param paterno the paterno to set
     */
    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    /**
     * @return the seguroSocial
     */
    public long getSeguroSocial() {
        return seguroSocial;
    }

    /**
     * @param seguroSocial the seguroSocial to set
     */
    public void setSeguroSocial(long seguroSocial) {
        this.seguroSocial = seguroSocial;
    }

    /**
     * @return the sueldoBase
     */
    public float getSueldoBase() {
        return sueldoBase;
    }

    /**
     * @param sueldoBase the sueldoBase to set
     */
    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    /**
     * @return the horasExtra
     */
    public int getHorasExtra() {
        return horasExtra;
    }

    /**
     * @param horasExtra the horasExtra to set
     */
    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }
}
