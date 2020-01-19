package br.com.mns.resultatec.milerp.model.pessoa;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PessoaPK implements Serializable{
 
	private static final long serialVersionUID = 5775014994596948972L;
	
 	private Long cdPessoa;

 	public PessoaPK() {}
 	
 	public PessoaPK(Long cdPessoa) {
 		this.cdPessoa = cdPessoa;
 	}
 	
	public Long getCdPessoa() {
		return cdPessoa;
	}
	public void setCdPessoa(Long cdPessoa) {
		this.cdPessoa = cdPessoa;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		PessoaPK other = (PessoaPK) obj;
		if (cdPessoa == null) {
			if (other.cdPessoa != null)
				return false;
		} else if (!cdPessoa.equals(other.cdPessoa))
			return false;
		return true;
	}

}
