package it.torino.comune.scuolaPM.model;

import java.util.*;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;

 
@Entity

@View(members= // This view has no name, so it will be the view used by default
" sesso, matricola, nome, cognome ;" +
		"qualifica, dipendentePM ,numeroCaratteristico;" +
"numeroCell,email;" +
"Dati anagrafici { dataNascita,comuneNascita,provinciaNascita; indirizzo }" +
"foto { foto }" +
"albo { dataIscrizioneAlbo;statoDomandaIscrizione;noteAlbo }" +
"CV { lingue;gradoStudio;titoloStudio;hobby }" +
"DOC { morePhotos }" +
"CORSI { partecipazioniSessioniCorsi }" +
"Titoli { titoliStudio }" +
"Lingue { lingueParlate }" +
"note {note}"
)

public class Persona {


	@Id
	@GeneratedValue(generator="system-uuid")
    @Hidden
    @GenericGenerator(name="system-uuid", strategy="uuid")
    @Column(length=32)
	private String oid;
	@Column(length=7)
	private String numeroCaratteristico;
	  // anagrafici
	@Column(length=20)
	private String nome;
	@Column(length=20)
	private String cognome;
	
    private Date dataNascita;
	
    @Stereotype("PHOTO") // The user can view and change a photo
    @Column(length=16777216) // This size to store big photos
    private byte [] foto;
    
    @Stereotype("IMAGES_GALLERY") // A complete image gallery is available
    @Column(length=32) // The 32 length string is for storing the key of the gallery
    private String morePhotos;
	
	private Boolean dipendentePM;

	@Column(length=1)
	private String sesso;
	@Column(length=30)
	private String comuneNascita;
	@Column(length=4)
	private String provinciaNascita;
	
	
	private Integer matricola;

	@Embedded // This is the way to reference an embeddable class
    private Indirizzo indirizzo; // A regular Java reference
	
    @Stereotype("MEMO")
    private String note;

	    
    @Column(length=16)
	private String codiceFiscale;

	@Stereotype("TELEPHONE")
	private String numeroTelResidenza;
	 
	    // recapiti
	@Stereotype("TELEPHONE")
	private String numeroCell;
	@Stereotype("EMAIL")
	private String email;

	private Date dataFineServizio;

	    
	 
	@Column(length=255)
	private String lingue;
	@Column(length=255)
	private String titoloStudio;
	@Column(length=255)
	private String gradoStudio;
	@Column(length=100)
	private String hobby;
	
	
    @ManyToOne(fetch=FetchType.LAZY, optional=false)
    @ReferenceView("Simple")
    //@DescriptionsList
    private Qualifica qualifica;
/*
	    @ManyToOne
	    private Reparto reparto;
	    
	    @Temporal(javax.persistence.TemporalType.DATE)
	    private Date dataAssunzionePM;
*/	    
        @ListProperties("grado, denominazione")
	    @ManyToMany
	    private List<TitoloStudio> titoliStudio;
	    @ListProperties("lingua.nome, livello, esameRegionale")
	    @ManyToMany
	    private List<LinguaConosciuta> lingueParlate;
	    @ListProperties("ruolo, sessioneCorso.dataInizio, sessioneCorso.corso.titolo, esito")
	    @OneToMany
	    private List<Partecipazione> partecipazioniSessioniCorsi;

	    
	    //ALBO REGIONALE

	 
	@Stereotype("MEMO")
	private String noteAlbo;
    @Column(length=255)
	private String statoDomandaIscrizione; //Domanda, Accettazione, Iscrizione
	@Column(length=255)
	private Date dataIscrizioneAlbo;

	public Integer getMatricola() {
		return matricola;
	}
	public void setMatricola(Integer matricola) {
		this.matricola = matricola;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getNumeroCaratteristico() {
		return numeroCaratteristico;
	}
	public void setNumeroCaratteristico(String numeroCaratteristico) {
		this.numeroCaratteristico = numeroCaratteristico;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getComuneNascita() {
		return comuneNascita;
	}
	public void setComuneNascita(String comuneNascita) {
		this.comuneNascita = comuneNascita;
	}
	public Boolean getDipendentePM() {
		return dipendentePM;
	}
	public void setDipendentePM(Boolean dipendentePM) {
		this.dipendentePM = dipendentePM;
	}
	public String getSesso() {
		return sesso;
	}
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}
	public Indirizzo getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public String getProvinciaNascita() {
		return provinciaNascita;
	}
	public void setProvinciaNascita(String provinciaNascita) {
		this.provinciaNascita = provinciaNascita;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public String getNumeroTelResidenza() {
		return numeroTelResidenza;
	}
	public void setNumeroTelResidenza(String numeroTelResidenza) {
		this.numeroTelResidenza = numeroTelResidenza;
	}
	public String getNumeroCell() {
		return numeroCell;
	}
	public void setNumeroCell(String numeroCell) {
		this.numeroCell = numeroCell;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataFineServizio() {
		return dataFineServizio;
	}
	public void setDataFineServizio(Date dataFineServizio) {
		this.dataFineServizio = dataFineServizio;
	}
	public String getLingue() {
		return lingue;
	}
	public void setLingue(String lingue) {
		this.lingue = lingue;
	}
	public String getTitoloStudio() {
		return titoloStudio;
	}
	public void setTitoloStudio(String titoloStudio) {
		this.titoloStudio = titoloStudio;
	}
	public String getGradoStudio() {
		return gradoStudio;
	}
	public void setGradoStudio(String gradoStudio) {
		this.gradoStudio = gradoStudio;
	}
	public String getNoteAlbo() {
		return noteAlbo;
	}
	public void setNoteAlbo(String noteAlbo) {
		this.noteAlbo = noteAlbo;
	}
	public String getStatoDomandaIscrizione() {
		return statoDomandaIscrizione;
	}
	public void setStatoDomandaIscrizione(String statoDomandaIscrizione) {
		this.statoDomandaIscrizione = statoDomandaIscrizione;
	}
	public Date getDataIscrizioneAlbo() {
		return dataIscrizioneAlbo;
	}
	public void setDataIscrizioneAlbo(Date dataIscrizioneAlbo) {
		this.dataIscrizioneAlbo = dataIscrizioneAlbo;
	}
	public Qualifica getQualifica() {
		return qualifica;
	}
	public void setQualifica(Qualifica qualifica) {
		this.qualifica = qualifica;
	}
	public String getMorePhotos() {
		return morePhotos;
	}
	public void setMorePhotos(String morePhotos) {
		this.morePhotos = morePhotos;
	}
    public List<Partecipazione> getPartecipazioniSessioniCorsi() {
		return partecipazioniSessioniCorsi;
	}
	public void setPartecipazioniSessioniCorsi(List<Partecipazione> partecipazioniSessioniCorsi) {
		this.partecipazioniSessioniCorsi = partecipazioniSessioniCorsi;
	}
	public List<TitoloStudio> getTitoliStudio() {
		return titoliStudio;
	}
	public void setTitoliStudio(List<TitoloStudio> titoliStudio) {
		this.titoliStudio = titoliStudio;
	}
	public List<LinguaConosciuta> getLingueParlate() {
		return lingueParlate;
	}
	public void setLingueParlate(List<LinguaConosciuta> lingueParlate) {
		this.lingueParlate = lingueParlate;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	@SuppressWarnings("unchecked")
    public static List<Persona> getPersone() {
        Query query = org.openxava.jpa.XPersistence.getManager().createQuery(
                "select p.oid,p.nome,p.cognome,p.codiceFiscale,p.dataNascita from Persona as p");
        return query.getResultList();
    }
 	public static Persona findByOid(String oid) throws NoResultException { 			
 		Query query = org.openxava.jpa.XPersistence.getManager().createQuery("from Persona as o where o.oid = :oid"); 
		query.setParameter("oid", new String(oid)); 
		return (Persona) query.getSingleResult();
 	} 

}
