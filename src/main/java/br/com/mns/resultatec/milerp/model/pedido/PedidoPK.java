package br.com.mns.resultatec.milerp.model.pedido;

import java.io.Serializable;

import javax.persistence.Embeddable;
  
@Embeddable
public class PedidoPK  implements Serializable{
 
	private static final long serialVersionUID = -8146932703305829856L;
	
	private Integer nuAnoPedido;	
	private Long cdPedido;
	private Long cdSetor;
	
	public PedidoPK() {}
	
	public PedidoPK(Integer nuAnoPedido, Long cdPedido, Long cdSetor) {
		this.nuAnoPedido = nuAnoPedido;
		this.cdPedido = cdPedido;
		this.cdSetor = cdSetor;
	}

	public Long getCdSetor() {
		return cdSetor;
	}
	
	public void setCdSetor(Long cdSetor) {
		this.cdSetor = cdSetor;
	}
  
 	public Long getCdPedido() {
		return cdPedido;
	}
	
	public void setCdPedido(Long cdPedido) {
		this.cdPedido = cdPedido;
	}

	public Integer getNuAnoPedido() {
		return nuAnoPedido;
	}

	public void setNuAnoPedido(Integer nuAnoPedido) {
		this.nuAnoPedido = nuAnoPedido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdPedido == null) ? 0 : cdPedido.hashCode());
		result = prime * result + ((cdSetor == null) ? 0 : cdSetor.hashCode());
		result = prime * result + ((nuAnoPedido == null) ? 0 : nuAnoPedido.hashCode());
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
		PedidoPK other = (PedidoPK) obj;
		if (cdPedido == null) {
			if (other.cdPedido != null)
				return false;
		} else if (!cdPedido.equals(other.cdPedido))
			return false;
		if (cdSetor == null) {
			if (other.cdSetor != null)
				return false;
		} else if (!cdSetor.equals(other.cdSetor))
			return false;
		if (nuAnoPedido == null) {
			if (other.nuAnoPedido != null)
				return false;
		} else if (!nuAnoPedido.equals(other.nuAnoPedido))
			return false;
		return true;
	}

	
}
