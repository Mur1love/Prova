package pacote;

public class Filial {

	private String nome;
	private String cidade;

	public Filial() {
		super();
	}

	public Filial(String nome, String cidade) {
		super();
		this.nome = nome;
		this.cidade = cidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Filial [nome=" + nome + ", cidade=" + cidade + "]";
	}

}
