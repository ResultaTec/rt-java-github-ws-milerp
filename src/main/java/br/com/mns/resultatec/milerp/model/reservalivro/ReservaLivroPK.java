package br.com.mns.resultatec.milerp.model.reservalivro;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;

@Embeddable
public class ReservaLivroPK implements Serializable{

 
	private static final long serialVersionUID = 3673394171053599836L;
	
 	private Long cdPessoa;
	 
 	@GeneratedValue
	private Long cdLivro;
 	
 	public ReservaLivroPK() {}
 	
	public ReservaLivroPK(Long cdPessoa, Long cdLivro) {
 		this.cdPessoa = cdPessoa;
		this.cdLivro = cdLivro;
	}
	
	public Long getCdPessoa() {
		return cdPessoa;
	}
	
	public void setCdPessoa(Long cdPessoa) {
		this.cdPessoa = cdPessoa;
	}
	
	public Long getCdLivro() {
		return cdLivro;
	}
	
	public void setCdLivro(Long cdLivro) {
		this.cdLivro = cdLivro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdLivro == null) ? 0 : cdLivro.hashCode());
		result = prime * result + ((cdPessoa == null) ? 0 : cdPessoa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReservaLivroPK other = (ReservaLivroPK) obj;
		if (cdLivro == null) {
			if (other.cdLivro != null)
				return false;
		} else if (!cdLivro.equals(other.cdLivro))
			return false;
		if (cdPessoa == null) {
			if (other.cdPessoa != null)
				return false;
		} else if (!cdPessoa.equals(other.cdPessoa))
			return false;
		return true;
	}
		
}
