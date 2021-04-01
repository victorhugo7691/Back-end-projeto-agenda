package br.com.contatos.projeto.operadora;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

@Repository
public class OperadoraRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Operadora> listarOperadora(){
		String psql="SELECT c FROM Operadora c";
		TypedQuery<Operadora> typedQuery = this.entityManager.createQuery(psql, Operadora.class);
		return typedQuery.getResultList();
	}
 	
}
