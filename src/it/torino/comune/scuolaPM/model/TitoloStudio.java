package it.torino.comune.scuolaPM.model;

import java.util.*;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;

@Entity

public class TitoloStudio {
	@Id
	@GeneratedValue(generator="system-uuid")
    @Hidden
    @GenericGenerator(name="system-uuid", strategy="uuid")
    private Long id;
	@Column(length=255)
    private String denominazione;
    
    private LivelloStudio grado;
    @ManyToMany
    private List<Persona> persone;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDenominazione() {
		return denominazione;
	}
	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}
	public LivelloStudio getGrado() {
		return grado;
	}
	public void setGrado(LivelloStudio grado) {
		this.grado = grado;
	}
	public List<Persona> getPersone() {
		return persone;
	}
	public void setPersone(List<Persona> persone) {
		this.persone = persone;
	}

}
