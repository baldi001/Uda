/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author favaron
 */
@Entity
@Table(name="AZIONI_CORRETTIVE")
public class AzioniCorrettive implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="IdAzione")
    private int idAzione;
    
    @Column(name="Costo")
    private double costo;
    
    @Column(name="Data")
    private Date data;
    
    @JoinColumn(name="Segnalazione", referencedColumnName="IdSegnalazione")
    @ManyToOne
    private int segnalazione;
    
    @JoinColumn(name="Team", referencedColumnName="IdTeam")
    @ManyToOne
    private int team;

    public int getIdAzione() {
        return idAzione;
    }

    public void setIdAzione(int idAzione) {
        this.idAzione = idAzione;
    }
    
    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    public Date getData() {
        return data;
    }

    public void setData(Date costo) {
        this.data = data;
    }
    
    public int getSegnalazione() {
        return segnalazione;
    }

    public void setSegnalazione(int segnalazione) {
        this.segnalazione = segnalazione;
    }
    
    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idAzione;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AzioniCorrettive)) {
            return false;
        }
        AzioniCorrettive other = (AzioniCorrettive) object;
        if (this.idAzione != other.idAzione) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myapp.model.AzioniCorrettive[ id=" + idAzione + " ]";
    }
    
}
