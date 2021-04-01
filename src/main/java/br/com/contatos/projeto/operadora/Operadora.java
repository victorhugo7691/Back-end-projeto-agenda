package br.com.contatos.projeto.operadora;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.contatos.projeto.listatelefonica.ListaTelefonica;

@Entity
@Table(name="operadora")
public class Operadora {

	@Id
	@Column(name="codigo")
	private Integer codigo;
	@Column(name="nome")
	private String nome;
	@Column(name="categoria")
	private String categoria;
	@Column(name="preco")
	private Float preco;
	
	/*@OneToMany(fetch = FetchType.LAZY, mappedBy ="codigo")
	private List<ListaTelefonica> listaTelefonica;*/
	
	public Operadora() {}

	public Operadora(Integer codigo, String nome, String categoria, Float preco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}
	
	
}
