package br.com.mns.resultatec.milerp.model.empresa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="empresa")
@IdClass(EmpresaPK.class)
public class Empresa {

	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long cdEmpresa;
	
	public Empresa(){
		
	}
}
