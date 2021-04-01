package br.com.contatos.projeto.listatelefonica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListaTelefonicaService {

	@Autowired
	private ListaTelefonicaRepository listaRepository;
	
	public List<ListaTelefonica> listarContatos(){
		return this.listaRepository.listarContatos();
	}
}
