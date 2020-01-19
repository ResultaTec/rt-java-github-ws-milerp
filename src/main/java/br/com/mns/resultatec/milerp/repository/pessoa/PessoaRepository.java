package br.com.mns.resultatec.milerp.repository.pessoa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mns.resultatec.milerp.model.pessoa.Pessoa;
import br.com.mns.resultatec.milerp.model.pessoa.PessoaPK;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, PessoaPK> {
 
}
