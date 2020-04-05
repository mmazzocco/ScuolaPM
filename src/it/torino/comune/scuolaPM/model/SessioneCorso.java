package it.torino.comune.scuolaPM.model;

import java.util.*;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;

@Entity
public class SessioneCorso {
	    @Id
	    @GeneratedValue
	    @Hidden
	    private Long id;
	    private Date dataInizio;
	    private Date dataFine;
	    @Column(length=255)
	    private String aule;
	    @Column(length=255)
	    private String orario;
	    @Column(length=255)
	    private String note;
	    @ListProperties("ruolo, persona.cognome, persona.nome")
	    @OneToMany
	    private List<Partecipazione> partecipanti;
	    @ManyToOne
	    private Corso corso;
	    
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Date getDataInizio() {
			return dataInizio;
		}
		public void setDataInizio(Date dataInizio) {
			this.dataInizio = dataInizio;
		}
		public Date getDataFine() {
			return dataFine;
		}
		public void setDataFine(Date dataFine) {
			this.dataFine = dataFine;
		}
		public String getAule() {
			return aule;
		}
		public void setAule(String aule) {
			this.aule = aule;
		}
		public String getOrario() {
			return orario;
		}
		public void setOrario(String orario) {
			this.orario = orario;
		}
		public String getNote() {
			return note;
		}
		public void setNote(String note) {
			this.note = note;
		}
		public List<Partecipazione> getPartecipanti() {
			return partecipanti;
		}
		public void setPartecipanti(List<Partecipazione> partecipanti) {
			this.partecipanti = partecipanti;
		}
		public Corso getCorso() {
			return corso;
		}
		public void setCorso(Corso corso) {
			this.corso = corso;
		}

	    
}
