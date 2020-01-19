package br.com.mns.resultatec.milerp.repository.pedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mns.resultatec.milerp.model.pedido.Pedido;
import br.com.mns.resultatec.milerp.model.pedido.PedidoPK;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, PedidoPK>{

}
