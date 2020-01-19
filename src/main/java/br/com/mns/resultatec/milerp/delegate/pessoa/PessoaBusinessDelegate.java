package br.com.mns.resultatec.milerp.delegate.pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mns.resultatec.milerp.model.pessoa.Pessoa;
import br.com.mns.resultatec.milerp.model.pessoa.PessoaPK;
import br.com.mns.resultatec.milerp.service.pessoa.PessoaService;

@Service
public class PessoaBusinessDelegate {

	@Autowired
	PessoaService pessoaService;
	
	public Pessoa save(Pessoa pessoa) {
		return pessoaService.save(pessoa);
	}
	
	public Pessoa findByPrimaryKey(PessoaPK pessoaPK) {
		return pessoaService.findByPrimaryKey(pessoaPK);
	}
}
