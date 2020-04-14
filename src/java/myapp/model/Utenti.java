package myapp.model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matteofavaron
 */
@Entity
@Table(name="UTENTI")
public class Utenti implements Serializable{
    
    private static final long serialVersionUID= 1L;
    @Id
    @Column(name="Username")
    private String username;
    
    @Column(name="Nome")
    private String nome;
    
    @Column(name="Cognome")
    private String cognome;
    
    @Column(name="Pass")
    private String pass;
    
    @Enumerated(EnumType.STRING)
    @Column(name="Responsabile")
    private Enum responsabile;
    
    @OneToMany(cascade= CascadeType.ALL, mappedBy = "utente")
    private Set<Settori> settoriCollection;
    
    @OneToMany(cascade= CascadeType.ALL, mappedBy= "utente")
    private Set<Segnalazioni> segnalazioniCollection;
    
    @OneToMany(cascade= CascadeType.ALL, mappedBy= "utente")
    private Set<VerificaAzioniCorrettive> verificaAzioniCorrettiveCollection;
    
    @ManyToMany(mappedBy="utenti")
    private Set<Team> team;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUsername() {
        return username;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getPass() {
        return pass;
    }

    public Enum getResponsabile() {
        return responsabile;
    }

    public Set<Settori> getSettoriCollection() {
        return settoriCollection;
    }

    public Set<Segnalazioni> getSegnalazioniCollection() {
        return segnalazioniCollection;
    }

    public Set<VerificaAzioniCorrettive> getVerificaAzioniCorrettiveCollection() {
        return verificaAzioniCorrettiveCollection;
    }

    public Set<Team> getTeam() {
        return team;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setResponsabile(Enum responsabile) {
        this.responsabile = responsabile;
    }

    public void setSettoriCollection(Set<Settori> settoriCollection) {
        this.settoriCollection = settoriCollection;
    }

    public void setSegnalazioniCollection(Set<Segnalazioni> segnalazioniCollection) {
        this.segnalazioniCollection = segnalazioniCollection;
    }

    public void setVerificaAzioniCorrettiveCollection(Set<VerificaAzioniCorrettive> verificaAzioniCorrettiveCollection) {
        this.verificaAzioniCorrettiveCollection = verificaAzioniCorrettiveCollection;
    }

    public void setTeam(Set<Team> team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Utenti{" + "username=" + username + ", nome=" + nome + ", cognome=" + cognome + ", pass=" + pass + ", responsabile=" + responsabile + ", settoriCollection=" + settoriCollection + ", segnalazioniCollection=" + segnalazioniCollection + ", verificaAzioniCorrettiveCollection=" + verificaAzioniCorrettiveCollection + ", team=" + team + '}';
    }
    
    
    
    
}
