package it.torino.comune.scuolaPM.model;

import java.util.*;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator; // ADD THIS IMPORT
import org.openxava.annotations.*;

 
@Entity

public class LinguaParlata {
    @Id
    @GeneratedValue
    @Hidden
    private Long id;
    @Column(length=20)
    private String nome;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
