package br.com.mns.resultatec.milerp.model.setor;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class SetorPK implements Serializable{

	private static final long serialVersionUID = -6684137138967814681L;
	private Long cdSetor;
	private Long cdFilial;
	
	public Long getCdSetor() {
		return cdSetor;
	}
	public void setCdSetor(Long cdSetor) {
		this.cdSetor = cdSetor;
	}
	public Long getCdFilial() {
		return cdFilial;
	}
	public void setCdFilial(Long cdFilial) {
		this.cdFilial = cdFilial;
	}
	
	
	
}
