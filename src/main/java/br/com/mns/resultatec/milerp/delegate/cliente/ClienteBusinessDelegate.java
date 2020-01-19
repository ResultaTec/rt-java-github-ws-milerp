package br.com.mns.resultatec.milerp.delegate.cliente;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mns.resultatec.milerp.model.cliente.Cliente;
import br.com.mns.resultatec.milerp.model.cliente.ClientePK;
import br.com.mns.resultatec.milerp.service.cliente.ClienteService;

@Service
public class ClienteBusinessDelegate {

	@Autowired
	private ClienteService clienteService;
	
	
	public Cliente save(Cliente cliente) {
		return clienteService.save(cliente);
	}
	
	public Collection<Cliente> findAll() {
		return clienteService.findAll();
	}
	
	public void delete(Cliente cliente){
		clienteService.delete(cliente);
	}
	
	public Cliente findByPrimaryKey(ClientePK clientePK){
		return clienteService.findByPrimaryKey(clientePK);
	}
}
