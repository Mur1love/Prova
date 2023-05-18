package pacote;

public class Cliente {

	private String nome;
	private String telefone;
	private String rg;
	private Filial filial;

	public Cliente() {
		super();
	}

	public Cliente(String nome, String telefone, String rg, Filial filial) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.rg = rg;
		this.filial = filial;
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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Filial getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
		this.filial = filial;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", telefone=" + telefone + ", rg=" + rg + ", filial=" + filial.getNome() + "]";
	}

}
