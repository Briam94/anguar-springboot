/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intento2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;
/**
 *
 * @author BRIAN
 */


@Entity
@Table(name="usuario")
public class Usuario {
   @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int usuid;
    @Column
     String usualias;
    @Column
    private String usunombre;
    @Column
    private String usupsw;
    @Column
    private String usuemail;
    @Column
    private String usufeclog;
    @Column
    private String usuestado;

    public int getUsuid() {
        return usuid;
    }

    public void setUsuid(int usuid) {
        this.usuid = usuid;
    }

    public String getUsualias() {
        return usualias;
    }

    public void setUsualias(String usualias) {
        this.usualias = usualias;
    }

    public String getUsunombre() {
        return usunombre;
    }

    public void setUsunombre(String usunombre) {
        this.usunombre = usunombre;
    }

    public String getUsupsw() {
        return usupsw;
    }

    public void setUsupsw(String usupsw) {
        this.usupsw = usupsw;
    }

    public String getUsuemail() {
        return usuemail;
    }

    public void setUsuemail(String usuemail) {
        this.usuemail = usuemail;
    }

    public String getUsufeclog() {
        return usufeclog;
    }

    public void setUsufeclog(String usufeclog) {
        this.usufeclog = usufeclog;
    }

    public String getUsuestado() {
        return usuestado;
    }

    public void setUsuestado(String usuestado) {
        this.usuestado = usuestado;
    }

    
    
}
