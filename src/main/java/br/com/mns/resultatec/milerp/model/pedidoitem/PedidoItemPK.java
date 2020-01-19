package br.com.mns.resultatec.milerp.model.pedidoitem;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PedidoItemPK implements Serializable{

	private static final long serialVersionUID = -8430068372928551482L;
	private Long seqItemPedido;
	private Long cdPedido;
	private Integer nuAnoPedido;
	
	public PedidoItemPK(){}
	
	public PedidoItemPK(Integer nuAnoPedido, Long cdPedido, Long seqItemPedido) {
		this.nuAnoPedido = nuAnoPedido;
		this.cdPedido = cdPedido;
		this.seqItemPedido = seqItemPedido;
	}
	
	public Long getSeqItemPedido() {
		return seqItemPedido;
	}
	public void setSeqItemPedido(Long seqItemPedido) {
		this.seqItemPedido = seqItemPedido;
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
		result = prime * result + ((nuAnoPedido == null) ? 0 : nuAnoPedido.hashCode());
		result = prime * result + ((seqItemPedido == null) ? 0 : seqItemPedido.hashCode());
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
		PedidoItemPK other = (PedidoItemPK) obj;
		if (cdPedido == null) {
			if (other.cdPedido != null)
				return false;
		} else if (!cdPedido.equals(other.cdPedido))
			return false;
		if (nuAnoPedido == null) {
			if (other.nuAnoPedido != null)
				return false;
		} else if (!nuAnoPedido.equals(other.nuAnoPedido))
			return false;
		if (seqItemPedido == null) {
			if (other.seqItemPedido != null)
				return false;
		} else if (!seqItemPedido.equals(other.seqItemPedido))
			return false;
		return true;
	}
	
	
	
}
