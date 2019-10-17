/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.app.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author ramiro
 */
@Entity
public class Rol implements Serializable {
    
    public static final String ADMINISTRADOR = "administrador";
    public static final String CLIENTE = "cliente";
    public static final String OPERARIO = "operario";

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Link> linksDisponibles;

    public List<Link> getLinksDisponibles() {
        return linksDisponibles;
    }

    public void setLinksDisponibles(List<Link> linksDisponibles) {
        this.linksDisponibles = linksDisponibles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rol)) {
            return false;
        }
        Rol other = (Rol) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Rol[ id=" + id + " ]";
    }

    public Rol() {
        linksDisponibles=new ArrayList<>();
    }
    
    

}
