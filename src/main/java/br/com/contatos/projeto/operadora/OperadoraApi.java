package br.com.contatos.projeto.operadora;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operadora")
@CrossOrigin
public class OperadoraApi {

	@Autowired
	private OperadoraService operadoraService;
	
	@GetMapping
	public List<Operadora> listarOperadora(){
		return this.operadoraService.listarOperadora();
	}
}
