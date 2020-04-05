package it.torino.comune.scuolaPM.model;

import javax.persistence.*;

@Embeddable // We use @Embeddable instead of @Entity
	public class Indirizzo {
	 
	    @Column(length = 30) // The members are annotated as in entity case
	    private String via;
	 
	    @Column(length = 5)
	    private int cap;
	 
	    @Column(length = 20)
	    private String comune;

	    @Column(length = 2)
	    private String provincia;

		public String getVia() {
			return via;
		}

		public void setVia(String via) {
			this.via = via;
		}

		public int getCap() {
			return cap;
		}

		public void setCap(int cap) {
			this.cap = cap;
		}

		public String getComune() {
			return comune;
		}

		public void setComune(String comune) {
			this.comune = comune;
		}

		public String getProvincia() {
			return provincia;
		}

		public void setProvincia(String provincia) {
			this.provincia = provincia;
		}
	 
}
