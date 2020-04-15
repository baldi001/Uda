package myapp.model;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


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
@Table(name="SEGNALAZIONI")
public class Segnalazioni implements Serializable{
    
    private static final long serialVersionUID= 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="IdSegnalazione")
    private int idSegnalazione;
    
    @Column(name="Data")
    private Date data;
    
    @Column(name="Tipo")
    private String tipo;
    
    @Column(name="Descrizione")
    private String descrizione;
    
    @JoinColumn(name="Utente",referencedColumnName="Username")
    @ManyToOne 
    private Utenti utente;
    
    @JoinColumn(name="Settore",referencedColumnName="IdSettore")
    @ManyToOne 
    private Settori settore;
    
    @OneToMany(fetch= FetchType.EAGER,orphanRemoval=true, cascade= CascadeType.ALL, mappedBy= "segnalazione")
    private Set<AzioniCorrettive> azioniCorrettiveCollection;
    
    @Override
    public String toString() {
        return "Segnalazioni{" + "idSegnalazione=" + idSegnalazione + ", data=" + data + ", tipo=" + tipo + ", descrizione=" + descrizione + ", utente=" + utente + ", settore=" + settore + ", azioniCorrettiveCollection=" + azioniCorrettiveCollection + '}';
    }

    public void setIdSegnalazione(int idSegnalazione) {
        this.idSegnalazione = idSegnalazione;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setUtente(Utenti utente) {
        this.utente = utente;
    }

    public void setSettore(Settori settore) {
        this.settore = settore;
    }

    public void setAzioniCorrettiveCollection(Set<AzioniCorrettive> azioniCorrettiveCollection) {
        this.azioniCorrettiveCollection = azioniCorrettiveCollection;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getIdSegnalazione() {
        return idSegnalazione;
    }

    public Date getData() {
        return data;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public Utenti getUtente() {
        return utente;
    }

    public Settori getSettore() {
        return settore;
    }

    public Set<AzioniCorrettive> getAzioniCorrettiveCollection() {
        return azioniCorrettiveCollection;
    }

}