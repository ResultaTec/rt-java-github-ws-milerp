package br.com.mns.resultatec.milerp.model.empresa;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EmpresaPK implements Serializable{
 
	private static final long serialVersionUID = -5632088221429029471L;
	private Long cdEmpresa;

	public EmpresaPK() {}
	
	public EmpresaPK(Long cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdEmpresa == null) ? 0 : cdEmpresa.hashCode());
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
		EmpresaPK other = (EmpresaPK) obj;
		if (cdEmpresa == null) {
			if (other.cdEmpresa != null)
				return false;
		} else if (!cdEmpresa.equals(other.cdEmpresa))
			return false;
		return true;
	}

	public Long getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(Long cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}
	
	
}
