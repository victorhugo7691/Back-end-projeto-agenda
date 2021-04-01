package br.com.contatos.projeto.listatelefonica;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

@Repository
public class ListaTelefonicaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<ListaTelefonica> listarContatos(){
		String psql = "SELECT c FROM ListaTelefonica c";
		TypedQuery<ListaTelefonica> typedQuery = entityManager.createQuery(psql, ListaTelefonica.class);
		return typedQuery.getResultList();
	}
	
}
