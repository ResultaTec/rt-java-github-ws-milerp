package br.com.mns.resultatec.milerp.repository.reservalivro;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mns.resultatec.milerp.model.reservalivro.ReservaLivro;
import br.com.mns.resultatec.milerp.model.reservalivro.ReservaLivroPK;

public interface ReservaLivroRepository extends JpaRepository<ReservaLivro, ReservaLivroPK> {

}
