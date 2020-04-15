/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.model;

import java.io.Serializable;
import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name="VERIFICA_AZIONI_CORRETTIVE")
public class VerificaAzioniCorrettive implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idVerifica;
    
    @JoinColumn(name="Utente", referencedColumnName="Username")
    @ManyToOne 
    private Utenti utente;
    
    @JoinColumn(name="AzioneCorrettiva", referencedColumnName="IdAzione")
    @ManyToOne
    private AzioniCorrettive azioneCorrettiva;
    
    public int getIdVerifica() {
        return idVerifica;
    }

    public void setIdVerifica(int idVerifica) {
        this.idVerifica = idVerifica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idVerifica;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VerificaAzioniCorrettive)) {
            return false;
        }
        VerificaAzioniCorrettive other = (VerificaAzioniCorrettive) object;
        if (this.idVerifica != other.idVerifica) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myapp.model.VerificaAzioniCorrettive[ id=" + idVerifica + " ]";
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Utenti getUtente() {
        return utente;
    }

    public AzioniCorrettive getAzioneCorrettiva() {
        return azioneCorrettiva;
    }

    public void setUtente(Utenti utente) {
        this.utente = utente;
    }

    public void setAzioneCorrettiva(AzioniCorrettive azioneCorrettiva) {
        this.azioneCorrettiva = azioneCorrettiva;
    }
    
    
    
}
