/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica1web.practica1web.entity;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Jorklin
 */
@Entity
@Table(name = "conciertos")
public class Concierto implements Serializable{
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long idCon;
     private String artista;
     private int costo;
     //private Date fecha;
     private int capacidad;
     private String lugar;

    /**
     * @return the idCon
     */
    public long getIdCon() {
        return idCon;
    }

    /**
     * @param idCon the idCon to set
     */
    public void setIdCon(long idCon) {
        this.idCon = idCon;
    }

    /**
     * @return the artista
     */
    public String getArtista() {
        return artista;
    }

    /**
     * @param artista the artista to set
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     * @return the costo
     */
    public int getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }

    /**
     * @return the fecha
     */
 //   public Date getFecha() {
     //   return fecha;
  //  }

    /**
     * @param fecha the fecha to set
     */
  //  public void setFecha(Date fecha) {
  //      this.fecha = fecha;
  //  }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the lugar
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * @param lugar the lugar to set
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
     
     
     
}
   