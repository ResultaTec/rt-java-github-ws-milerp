package br.com.mns.resultatec.milerp.service.pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mns.resultatec.milerp.model.pessoa.Pessoa;
import br.com.mns.resultatec.milerp.model.pessoa.PessoaPK;
import br.com.mns.resultatec.milerp.repository.pessoa.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	PessoaRepository pessoaRepository;
	
	public Pessoa save(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	public Pessoa findByPrimaryKey(PessoaPK pessoaPK) {
		return pessoaRepository.findOne(pessoaPK);
	}
}
