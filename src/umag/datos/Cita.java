/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.datos;
import umag.gui.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 *
 * @author carlos
 */
public class Cita {
    private int id;
    private boolean especialista;
    private boolean beneficiario;
    private String tipoAfiliacion;
    private float precio;
    

    public Cita(int id, boolean especialista, boolean beneficiario, String tipoAfiliacion, float precio) {
        this.id = id;
        this.especialista = especialista;
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
     * @return the especialista
     */
    public boolean isEspecialista() {
        return especialista;
    }

    /**
     * @param especialista the especialista to set
     */
    public void setEspecialista(boolean especialista) {
        this.especialista = especialista;
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
        return "Cita{" + "id=" + id + ", especialista=" + especialista + ", beneficiario=" + beneficiario + ", tipoAfiliacion=" + tipoAfiliacion + '}';
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
