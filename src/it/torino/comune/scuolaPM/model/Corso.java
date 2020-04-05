package it.torino.comune.scuolaPM.model;

import java.util.*;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;

@Entity
public class Corso {
    @Id
    @GeneratedValue
    @Hidden
    private Long id;
    @Column(length=255)
    private String titolo;
    private TipologiaCorso tipologiaCorso;
    @Column(length=255)
    private String noteDiProgetto;
    @Column(length=255)
    private String note;    
    @ManyToOne
    private Argomento argomento;
    
    @OneToMany(mappedBy="corso")
    private List<SessioneCorso> sessioni;
    
    
	public TipologiaCorso getTipologiaCorso() {
		return tipologiaCorso;
	}
	public void setTipologiaCorso(TipologiaCorso tipologiaCorso) {
		this.tipologiaCorso = tipologiaCorso;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getNoteDiProgetto() {
		return noteDiProgetto;
	}
	public void setNoteDiProgetto(String noteDiProgetto) {
		this.noteDiProgetto = noteDiProgetto;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Argomento getArgomento() {
		return argomento;
	}
	public void setArgomento(Argomento argomento) {
		this.argomento = argomento;
	}
	public List<SessioneCorso> getSessioni() {
		return sessioni;
	}
	public void setSessioni(List<SessioneCorso> sessioni) {
		this.sessioni = sessioni;
	}
    
}
