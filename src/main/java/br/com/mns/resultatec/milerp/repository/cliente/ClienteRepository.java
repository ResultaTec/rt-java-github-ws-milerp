package br.com.mns.resultatec.milerp.repository.cliente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.mns.resultatec.milerp.model.cliente.Cliente;
import br.com.mns.resultatec.milerp.model.cliente.ClientePK;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, ClientePK>{
	
	@Query("from Cliente cliente join fetch cliente.pessoa pessoa")
	List<Cliente> findAll();
		
}
