package br.com.mns.resultatec.milerp.model.pessoa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="pessoa")
@IdClass(PessoaPK.class)
public class Pessoa {

	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long cdPessoa;
	
	@Column(nullable=false, length=50 , unique = true)
 	private String cdCodigo;
	
 	@Column(nullable=false, length=300)
	private String nmNome;
 	
 	@Column(nullable=false, length=2)
 	private String flTipoPessoa;
 	
 	@Column(length=18, unique = true)
	private String deCpfCnpj;
	
	@Column(nullable=false, length=1)
	private String flSexo;
	
	@Column(nullable=false, length=50)
	private String deEmail;
	
	@Column(nullable=true, length=50)
	private String deTelefone;
	
	@Column(nullable=true, length=50)
	private String deCelular;
	
	@Column(nullable=true, length=50)
	private String deCep;
	
	@Column(nullable=true, length=50)
	private String deRua;
	
	@Column(nullable=true, length=50)
	private String deEndereco;
	
	@Column(nullable=true, length=10)
	private String deComplemento;
	
	@Column(nullable=true, length=50)
	private String deBairro;
	
	@Column(nullable=true, length=50)
	private String deCidade;
	
	@Column(nullable=true, length=50)
	private String deUf;
	
	private Boolean flInativo;
	
	@Column(nullable=true, length=3000)
	private String deObservacao;

	public Pessoa() {
		
	}
	
	public Long getCdPessoa() {
		return cdPessoa;
	}

	public void setCdPessoa(Long cdPessoa) {
		this.cdPessoa = cdPessoa;
	}

	public String getCdCodigo() {
		return cdCodigo;
	}

	public void setCdCodigo(String cdCodigo) {
		this.cdCodigo = cdCodigo;
	}

	public String getNmNome() {
		return nmNome;
	}

	public void setNmNome(String nmNome) {
		this.nmNome = nmNome;
	}

	public String getFlTipoPessoa() {
		return flTipoPessoa;
	}

	public void setFlTipoPessoa(String flTipoPessoa) {
		this.flTipoPessoa = flTipoPessoa;
	}

	public String getDeCpfCnpj() {
		return deCpfCnpj;
	}

	public void setDeCpfCnpj(String deCpfCnpj) {
		this.deCpfCnpj = deCpfCnpj;
	}

	public String getFlSexo() {
		return flSexo;
	}

	public void setFlSexo(String flSexo) {
		this.flSexo = flSexo;
	}

	public String getDeEmail() {
		return deEmail;
	}

	public void setDeEmail(String deEmail) {
		this.deEmail = deEmail;
	}

	public String getDeTelefone() {
		return deTelefone;
	}

	public void setDeTelefone(String deTelefone) {
		this.deTelefone = deTelefone;
	}

	public String getDeCelular() {
		return deCelular;
	}

	public void setDeCelular(String deCelular) {
		this.deCelular = deCelular;
	}

	public String getDeCep() {
		return deCep;
	}

	public void setDeCep(String deCep) {
		this.deCep = deCep;
	}

	public String getDeRua() {
		return deRua;
	}

	public void setDeRua(String deRua) {
		this.deRua = deRua;
	}

	public String getDeEndereco() {
		return deEndereco;
	}

	public void setDeEndereco(String deEndereco) {
		this.deEndereco = deEndereco;
	}

	public String getDeComplemento() {
		return deComplemento;
	}

	public void setDeComplemento(String deComplemento) {
		this.deComplemento = deComplemento;
	}

	public String getDeBairro() {
		return deBairro;
	}

	public void setDeBairro(String deBairro) {
		this.deBairro = deBairro;
	}

	public String getDeCidade() {
		return deCidade;
	}

	public void setDeCidade(String deCidade) {
		this.deCidade = deCidade;
	}

	public String getDeUf() {
		return deUf;
	}

	public void setDeUf(String deUf) {
		this.deUf = deUf;
	}

	public Boolean getFlInativo() {
		return flInativo;
	}

	public void setFlInativo(Boolean flInativo) {
		this.flInativo = flInativo;
	}

	public String getDeObservacao() {
		return deObservacao;
	}

	public void setDeObservacao(String deObservacao) {
		this.deObservacao = deObservacao;
	}
 
	
}
