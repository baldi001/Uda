/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author favaron
 */
@Entity
@Table(name="TEAM")
public class Team implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="IdTeam")
    private int idTeam;
    
    @Column(name="NomeTeam")
    private String nomeTeam;
    
    @JoinColumn(name="Settore", referencedColumnName="IdSettore")
    @ManyToOne
    private Settori settore;
    
    @OneToMany(cascade= CascadeType.ALL, mappedBy = "team")
    private Set<AzioniCorrettive> azioniCorrettiveCollection;
    
    @JoinTable(name="U_T", joinColumns={
        @JoinColumn(name = "Team", referencedColumnName = "IdTeam")}, inverseJoinColumns = {
        @JoinColumn(name = "Utente", referencedColumnName = "Username")})
    @ManyToMany
    private Set<Utenti> utenti;
    
    public int getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(int idTeam) {
        this.idTeam = idTeam;
    }

    public String getNomeTeam() {
        return nomeTeam;
    }

    public void setNomeTeam(String nomeTeam) {
        this.nomeTeam = nomeTeam;
    }

    public Settori getSettore() {
        return settore;
    }

    public void setSettore(Settori settore) {
        this.settore = settore;
    }

    public Set<AzioniCorrettive> getAzioniCorrettiveCollection() {
        return azioniCorrettiveCollection;
    }

    public void setAzioniCorrettiveCollection(Set<AzioniCorrettive> azioniCorrettiveCollection) {
        this.azioniCorrettiveCollection = azioniCorrettiveCollection;
    }

    public Set<Utenti> getUtenti() {
        return utenti;
    }

    public void setUtenti(Set<Utenti> utenti) {
        this.utenti = utenti;
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idTeam;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Team)) {
            return false;
        }
        Team other = (Team) object;
        if (this.idTeam != other.idTeam) {
            return false;
        }
        return true;
    }


    
    
}
