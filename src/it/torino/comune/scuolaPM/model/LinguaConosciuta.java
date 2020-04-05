package it.torino.comune.scuolaPM.model;

import java.util.*;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator; // ADD THIS IMPORT
import org.openxava.annotations.*;

 
@Entity


public class LinguaConosciuta {
	    @Id
	    @GeneratedValue
	    @Hidden
	    private Long id;
	    @Column(length=20)
	    private String livello;
	    private Boolean esameRegionale;
	    
	    private Date dataEsame;
	    @ManyToOne
	    private LinguaParlata lingua;
	    
	    @ManyToMany
	    private List<Persona> persone;
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getLivello() {
			return livello;
		}
		public void setLivello(String livello) {
			this.livello = livello;
		}
		public Boolean getEsameRegionale() {
			return esameRegionale;
		}
		public void setEsameRegionale(Boolean esameRegionale) {
			this.esameRegionale = esameRegionale;
		}
		public Date getDataEsame() {
			return dataEsame;
		}
		public void setDataEsame(Date dataEsame) {
			this.dataEsame = dataEsame;
		}
		public LinguaParlata getLingua() {
			return lingua;
		}
		public void setLingua(LinguaParlata lingua) {
			this.lingua = lingua;
		}
		public List<Persona> getPersone() {
			return persone;
		}
		public void setPersone(List<Persona> persone) {
			this.persone = persone;
		}
		

}
