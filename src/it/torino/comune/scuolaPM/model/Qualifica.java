package it.torino.comune.scuolaPM.model;

import java.util.*;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;

@Entity

@View(name="Simple",
members="sigla, qualificaEstesa")

public class Qualifica {
    @Id
    @GeneratedValue
    @Hidden
    private Long id;
    @Column(length=4)
    private String sigla;
    @Column(length=30)
    private String qualificaEstesa;
    //@ManyToOne
    //private Ente ente;
    @OneToMany
    private List<Persona> persone;
    @ManyToOne(fetch=FetchType.LAZY)
    private Ente ente;  
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getQualificaEstesa() {
		return qualificaEstesa;
	}
	public void setQualificaEstesa(String qualificaEstesa) {
		this.qualificaEstesa = qualificaEstesa;
	}
	public List<Persona> getPersone() {
		return persone;
	}
	public void setPersone(List<Persona> persone) {
		this.persone = persone;
	}
	public Ente getEnte() {
		return ente;
	}
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	
}
