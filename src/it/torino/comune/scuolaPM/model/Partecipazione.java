package it.torino.comune.scuolaPM.model;

import java.util.*;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;

@Entity
public class Partecipazione {
    @Id
	@GeneratedValue
    @Hidden
    private Long id;
	@Enumerated(EnumType.ORDINAL)
    private Ruolo ruolo;
	@Column(length=30)
    private String esito;
	@Column(length=255)
    private String note;
    @ManyToOne(fetch=FetchType.LAZY, optional=false)
    private Persona persona;
    @ManyToOne(fetch=FetchType.LAZY, optional=false)
    private SessioneCorso sessioneCorso;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEsito() {
		return esito;
	}
	public void setEsito(String esito) {
		this.esito = esito;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public SessioneCorso getSessioneCorso() {
		return sessioneCorso;
	}
	public void setSessioneCorso(SessioneCorso sessioneCorso) {
		this.sessioneCorso = sessioneCorso;
	}
	public Ruolo getRuolo() {
		return ruolo;
	}
	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}

}
