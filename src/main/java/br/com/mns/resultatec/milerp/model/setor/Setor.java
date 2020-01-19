package br.com.mns.resultatec.milerp.model.setor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@Table(name="setor")
@IdClass(SetorPK.class)
public class Setor {

	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long cdSetor;
	
	@Id
	private Long cdFilial;

}
