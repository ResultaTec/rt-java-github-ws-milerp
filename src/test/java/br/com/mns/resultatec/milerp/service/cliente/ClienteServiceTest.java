package br.com.mns.resultatec.milerp.service.cliente;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.mns.resultatec.milerp.enums.TipoPessoaEnum;
import br.com.mns.resultatec.milerp.enums.TipoSexoPessoaEnum;
import br.com.mns.resultatec.milerp.model.cliente.Cliente;
import br.com.mns.resultatec.milerp.model.cliente.ClientePK;
import br.com.mns.resultatec.milerp.model.pessoa.Pessoa;
import br.com.mns.resultatec.milerp.repository.pessoa.PessoaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClienteServiceTest {
	
	@Autowired
	PessoaRepository pessoaRepepository;
	
	Pessoa pessoa = new Pessoa();

	@Autowired
	ClienteService clienteService;
	
	@Before
	public void carregar() {
		pessoa.setCdCodigo("0001");
		pessoa.setNmNome("André Velho");
		pessoa.setFlTipoPessoa(TipoPessoaEnum.PF.toString());
		pessoa.setFlSexo(TipoSexoPessoaEnum.M.toString());
		pessoa.setDeCpfCnpj("066.244.989-43");
		pessoa.setDeEmail("andre@resultatec.com.br");
		pessoa = pessoaRepepository.save(pessoa);
	}
	
	@Test
	public void saveClienteTest() {
		
		Cliente clienteSalvo = new Cliente();
		clienteSalvo.setPessoa(pessoa);
		clienteSalvo.setCdPessoa(pessoa.getCdPessoa());
 		clienteSalvo = clienteService.save(clienteSalvo);

 		ClientePK clientePK = new ClientePK();
 		clientePK.setCdCliente(clienteSalvo.getCdCliente());
 		clientePK.setCdPessoa(pessoa.getCdPessoa());
 		
 		Cliente clienteEncontrado = clienteService.findByPrimaryKey(clientePK);
 		Assert.assertNotNull(clienteEncontrado);		
	}
}
