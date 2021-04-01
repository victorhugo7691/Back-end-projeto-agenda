package br.com.contatos.projeto.operadora;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperadoraService {
	
	@Autowired
	private OperadoraRepository operadoraRepository;
	
	public List<Operadora> listarOperadora(){
		return this.operadoraRepository.listarOperadora();
	}
}
