package br.com.mns.resultatec.milerp.controller.cliente;

import java.util.Collection;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.mns.resultatec.milerp.delegate.cliente.ClienteBusinessDelegate;
import br.com.mns.resultatec.milerp.model.cliente.Cliente;
import br.com.mns.resultatec.milerp.model.cliente.ClientePK;

@RestController
public class ClienteController {
	
	private static final String PATH_CLIENTE = "/cliente";
 	
	@Autowired
	private ClienteBusinessDelegate clienteBusinessDelate;
	
	@RequestMapping(
			method=RequestMethod.GET, 
			value=PATH_CLIENTE,
			produces=MediaType.APPLICATION_JSON_VALUE)

	public  ResponseEntity<Collection<Cliente>> listarCliente() {
		Collection<Cliente> clientesCadastrados = clienteBusinessDelate.findAll();
		return new ResponseEntity<Collection<Cliente>>(clientesCadastrados, HttpStatus.OK);
	}
	
 	@RequestMapping(
			method=RequestMethod.POST, 
			value=PATH_CLIENTE, 
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Cliente> salvarCliente(@RequestBody Cliente cliente) {
		Cliente clienteSalvo = clienteBusinessDelate.save(cliente);
 		return new ResponseEntity<Cliente>(clienteSalvo, HttpStatus.CREATED);
	}
 	
	@RequestMapping(
			method=RequestMethod.DELETE, 
			value=PATH_CLIENTE
			)
 	public ResponseEntity<Cliente> excluirCliente(@RequestBody ClientePK clientePK) {
		Cliente clienteEncontrado = clienteBusinessDelate.findByPrimaryKey(clientePK);
		if (clienteEncontrado == null) return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
 		clienteBusinessDelate.delete(clienteEncontrado);
		return new ResponseEntity<Cliente>(HttpStatus.OK);
	}
	
	@RequestMapping(
			method=RequestMethod.PUT, 
			value=PATH_CLIENTE,
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
 	public ResponseEntity<Cliente> alterarCliente(@RequestBody Cliente cliente) {
		Cliente clienteEncontrado = clienteBusinessDelate.save(cliente);
		if (clienteEncontrado == null)  return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);  			
		return new ResponseEntity<Cliente>(clienteEncontrado, HttpStatus.OK); 
	}
	
}
