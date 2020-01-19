package br.com.mns.resultatec.milerp.model.cliente;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.mns.resultatec.milerp.model.empresa.Empresa;
import br.com.mns.resultatec.milerp.model.pessoa.Pessoa;

@Entity
@Table(name="cliente")
@IdClass(ClientePK.class)
public class Cliente {
	  
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long cdCliente;
	
	@Id
	@Column(name = "cdPessoa", unique = true, nullable=false)
	private Long cdPessoa;
	
	/*
	@Id
	@Column(name = "cdEmpresa", unique = true, nullable=false)
	private Long cdEmpresa;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "cdEmpresa", insertable = false, updatable = false)
	private Empresa empresa;
	*/
	@OneToOne (fetch=FetchType.LAZY)
	@JoinColumn(name = "cdPessoa", insertable = false, updatable = false)
   	private Pessoa pessoa;
	
 	private Double vlLimiteCompra;
	private Integer nuLimiteCarencia;
	
	@Temporal(TemporalType.DATE)
	private Date dtNascimento;
	
	private Integer nuIdade;
	
	@Column(length=50)
	private String deNaturalidade;
	
	@Temporal(TemporalType.DATE)
	private Date dtPrimeiraCompra;
 
	public Cliente() {
		this.setPessoa(new Pessoa());
 	}

	public Long getCdCliente() {
		return cdCliente;
	}
	
	public void setCdCliente(Long cdCliente) {
		this.cdCliente = cdCliente;
	}

	public Double getVlLimiteCompra() {
		return vlLimiteCompra;
	}

	public void setVlLimiteCompra(Double vlLimiteCompra) {
		this.vlLimiteCompra = vlLimiteCompra;
	}
 
 	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public Integer getNuIdade() {
		return nuIdade;
	}

	public void setNuIdade(Integer nuIdade) {
		this.nuIdade = nuIdade;
	}

	public String getDeNaturalidade() {
		return deNaturalidade;
	}

	public void setDeNaturalidade(String deNaturalidade) {
		this.deNaturalidade = deNaturalidade;
	}
 
	public Date getDtPrimeiraCompra() {
		return dtPrimeiraCompra;
	}

	public void setDtPrimeiraCompra(Date dtPrimeiraCompra) {
		this.dtPrimeiraCompra = dtPrimeiraCompra;
	}

	public Integer getNuLimiteCarencia() {
		return nuLimiteCarencia;
	}

	public void setNuLimiteCarencia(Integer nuLimiteCarencia) {
		this.nuLimiteCarencia = nuLimiteCarencia;
	}
 
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Long getCdPessoa() {
		return cdPessoa;
	}

	public void setCdPessoa(Long cdPessoa) {
		this.cdPessoa = cdPessoa;
	}
	
}
