package br.com.mns.resultatec.milerp.service.cliente;

import java.util.Collection;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
  
import br.com.mns.resultatec.milerp.model.cliente.Cliente;
import br.com.mns.resultatec.milerp.model.cliente.ClientePK;
import br.com.mns.resultatec.milerp.repository.cliente.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
 	public Cliente save(Cliente cliente) {
 		return clienteRepository.save(cliente);
	}
	 
	public Collection<Cliente> findAll() {
		return clienteRepository.findAll();
	}	 

	public void delete(Cliente cliente){
		clienteRepository.delete(cliente);
	}
	
	public Cliente findByPrimaryKey(ClientePK clientePK){
		return clienteRepository.findOne(clientePK);
	}
	
}
