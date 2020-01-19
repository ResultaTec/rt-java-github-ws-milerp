package br.com.mns.resultatec.milerp.model.cliente;

import java.io.Serializable;

import javax.persistence.Embeddable;
  
@Embeddable
public class ClientePK implements Serializable{

	private static final long serialVersionUID = -5896270989629037849L;

   	//private Long cdEmpresa;
   	private Long cdCliente;
   	private Long cdPessoa;
   	
   	public ClientePK(){}
   	
   	public ClientePK(Long cdEmpresa, Long cdCliente, Long cdPessoa) {
   		//this.cdEmpresa = cdEmpresa;
   		this.cdCliente = cdCliente;
   		this.cdPessoa = cdPessoa;
   	}
   	
  	public Long getCdCliente() {
		return cdCliente;
	}

	public void setCdCliente(Long cdCliente) {
		this.cdCliente = cdCliente;
	}
	
	public Long getCdPessoa() {
		return cdPessoa;
	}

	public void setCdPessoa(Long cdPessoa) {
		this.cdPessoa = cdPessoa;
	}
	 
	
}
