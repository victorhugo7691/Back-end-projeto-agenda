package br.com.contatos.projeto.listatelefonica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista-telefonica")
@CrossOrigin
public class ListaTelefonicaApi {

	@Autowired
	private ListaTelefonicaService listaService;
	
	@GetMapping
	public List<ListaTelefonica> listarContatos(){
		return this.listaService.listarContatos();
	}
}
