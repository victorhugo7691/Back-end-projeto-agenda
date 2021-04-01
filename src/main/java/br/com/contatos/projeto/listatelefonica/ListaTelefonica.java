package br.com.contatos.projeto.listatelefonica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.contatos.projeto.operadora.Operadora;

@Entity
@Table(name="lista_telefonica")
public class ListaTelefonica {

	@Id
	@Column(name="id_lista")
	private Integer idLista;
	@Column(name="nome")
	private String nome;
	@Column(name="telefone")
	private String telefone;
	@Column(name="data_nascimento")
	private String dataDeNascimento;
	@Column(name="operadora")
	private Integer operadora;
	
	/*@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "listaTelefonica")
	private Operadora operadoraObj;*/
	
	public ListaTelefonica() {}

	public ListaTelefonica(Integer idLista, String nome, String telefone, String dataDeNascimento, Integer operadora) {
		super();
		this.idLista = idLista;
		this.nome = nome;
		this.telefone = telefone;
		this.dataDeNascimento = dataDeNascimento;
		this.operadora = operadora;
	}

	public Integer getIdLista() {
		return idLista;
	}

	public void setIdLista(Integer idLista) {
		this.idLista = idLista;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Integer getOperadora() {
		return operadora;
	}

	public void setOperadora(Integer operadora) {
		this.operadora = operadora;
	}
	
	
}
