package it.torino.comune.scuolaPM.model;

import java.util.*;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;

@Entity
public class Materia {

	@Id
	@GeneratedValue
    @Hidden
    private Long id;
	@Column(length=100)
    private String materia;
    private AreaStudio areaStudio;
    public AreaStudio getAreaStudio() {
		return areaStudio;
	}
	public void setAreaStudio(AreaStudio areaStudio) {
		this.areaStudio = areaStudio;
	}
	@OneToMany
    private List<Argomento> argomenti;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public List<Argomento> getArgomenti() {
		return argomenti;
	}
	public void setArgomenti(List<Argomento> argomenti) {
		this.argomenti = argomenti;
	}

}
