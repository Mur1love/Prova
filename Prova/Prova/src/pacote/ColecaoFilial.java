package pacote;

import java.util.Arrays;

public class ColecaoFilial {

	Filial[] lista = new Filial[3];
	int total = 0;

	public String listar() {
		return Arrays.toString(this.lista);
	}

	public void cadastrar(Filial f) {
		aumentaArray();
		this.lista[this.total] = f;
		this.total++;
	}

	public void cadastrarPorPosicao(Filial f, int posicao) {
		aumentaArray();
		for (int i = this.total - 1; i >= posicao; i--) {
			this.lista[i + 1] = this.lista[i];
		}
		this.lista[posicao] = f;
		this.total++;

	}

	public void removerPorPosicao(int posicao) {
		aumentaArray();
		for (int i = posicao; i <= this.total - 1; i++) {
			this.lista[i] = this.lista[i + 1];
		}
		this.lista[this.total - 1] = null;
		this.total--;

	}

	public Filial procurarPorNome(String nome) {
		for (int i = 0; i < lista.length - 1; i++) {
			if (this.lista[i].getNome().equals(nome)) {
				return this.lista[i];
			}
		}
		return null;
	}

	public void aumentaArray() {
		if (this.lista.length == this.total) {
			Filial[] newFilial = new Filial[this.lista.length * 2];
			System.arraycopy(lista, 0, newFilial, 0, this.lista.length);
			this.lista = newFilial;

		}
	}

}
