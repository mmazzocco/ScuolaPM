package it.torino.comune.scuolaPM.model;

import java.util.*;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;

@Entity
public class Argomento {

	@Id
	@GeneratedValue
    @Hidden
    private Long id;
	@Column(length=100)
    private String argomento;
    @ManyToOne
    private Materia materia;
    @OneToMany(mappedBy="argomento")
    private List<Corso> corsi;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getArgomento() {
		return argomento;
	}
	public void setArgomento(String argomento) {
		this.argomento = argomento;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public List<Corso> getCorsi() {
		return corsi;
	}
	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}

    
}
