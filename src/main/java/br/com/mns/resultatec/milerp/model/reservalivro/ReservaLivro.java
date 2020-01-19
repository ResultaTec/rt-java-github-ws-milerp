package br.com.mns.resultatec.milerp.model.reservalivro;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class ReservaLivro {

	@EmbeddedId
	private ReservaLivroPK reservaLivroPK;
	
	public ReservaLivro() {
		this.setReservaLivroPK(new ReservaLivroPK());
	}

	public ReservaLivroPK getReservaLivroPK() {
		return reservaLivroPK;
	}

	public void setReservaLivroPK(ReservaLivroPK reservaLivroPK) {
		this.reservaLivroPK = reservaLivroPK;
	}
	
	
}
