/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.datos;

import java.util.ArrayList;

/**
 *
 * @author carla
 */
public class Paciente {
    
    private int id;
    private String nombre;
    private String sexo;
    private String edad;
    private boolean beneficiario;
    private String tipoAfiliacion;

    public Paciente(int id, String nombre, String sexo, String edad, boolean beneficiario, String tipoAfiliacion) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.beneficiario = beneficiario;
        this.tipoAfiliacion = tipoAfiliacion;
    }
    
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * @return the beneficiario
     */
    public boolean isBeneficiario() {
        return beneficiario;
    }

    /**
     * @param beneficiario the beneficiario to set
     */
    public void setBeneficiario(boolean beneficiario) {
        this.beneficiario = beneficiario;
    }

    /**
     * @return the tipoAfiliacion
     */
    public String getTipoAfiliacion() {
        return tipoAfiliacion;
    }

    /**
     * @param tipoAfiliacion the tipoAfiliacion to set
     */
    public void setTipoAfiliacion(String tipoAfiliacion) {
        this.tipoAfiliacion = tipoAfiliacion;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", beneficiario=" + beneficiario + ", tipoAfiliacion=" + tipoAfiliacion + '}';
    }
    
}
