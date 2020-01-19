package br.com.mns.resultatec.milerp.model.pedido;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="pedido")
@IdClass(PedidoPK.class)
public class Pedido {
	
	@Id
	private Integer nuAnoPedido;	
	
	@Id
	private Long cdSetor;
	
	@Id @GeneratedValue
	private Long cdPedido;
	
	public Pedido() {
		
 	}
	


}
