package br.com.mns.resultatec.milerp.model.pedidoitem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="pedidoItem")
@IdClass(PedidoItemPK.class)
public class PedidoItem {

	@Id
	@GeneratedValue
	private Long seqItemPedido;
	
	@Id
	private Long cdPedido;
	
	@Id
	private Integer nuAnoPedido;
	
	public PedidoItem() {}
	
	
}
