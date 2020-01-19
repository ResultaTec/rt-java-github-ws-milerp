package br.com.mns.resultatec.milerp.service.pessoa;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.mns.resultatec.milerp.enums.TipoPessoaEnum;
import br.com.mns.resultatec.milerp.enums.TipoSexoPessoaEnum;
import br.com.mns.resultatec.milerp.model.pessoa.Pessoa;
import br.com.mns.resultatec.milerp.model.pessoa.PessoaPK;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PessoaServiceTest {

	@Autowired
	PessoaService pessoaService;
	
	@Test
	public void savePessoaTest() {
		Pessoa pessoa = new Pessoa();
		pessoa.setCdCodigo("0002");
		pessoa.setNmNome("André Velho");
		pessoa.setFlTipoPessoa(TipoPessoaEnum.PF.toString());
		pessoa.setFlSexo(TipoSexoPessoaEnum.M.toString());
		pessoa.setDeCpfCnpj("066.244.989-45");
		pessoa.setDeEmail("andre@resultatec.com.br");
		pessoa = pessoaService.save(pessoa);
		
		PessoaPK pessoaPK = new PessoaPK();
		pessoaPK.setCdPessoa(pessoa.getCdPessoa());
		
		Pessoa pessoaBuscar = pessoaService.findByPrimaryKey(pessoaPK);
		Assert.assertNotNull(pessoaBuscar);
	}
	
}
