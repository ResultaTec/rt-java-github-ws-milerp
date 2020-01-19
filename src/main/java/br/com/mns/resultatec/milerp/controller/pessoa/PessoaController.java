package br.com.mns.resultatec.milerp.controller.pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.mns.resultatec.milerp.delegate.pessoa.PessoaBusinessDelegate;
import br.com.mns.resultatec.milerp.model.pessoa.Pessoa;

@RestController
public class PessoaController {

	@Autowired
	private PessoaBusinessDelegate pessoaBusinessDelegate;
	
	@RequestMapping(
			method=RequestMethod.POST, 
			value="/pessoas", 
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pessoa> cadastrarCliente(@RequestBody Pessoa pessoa) {
		Pessoa pessoaSalva = pessoaBusinessDelegate.save(pessoa);
		return new ResponseEntity<Pessoa>(pessoaSalva, HttpStatus.CREATED);
	}
}
