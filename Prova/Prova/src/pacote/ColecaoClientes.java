package pacote;

import java.util.Arrays;

public class ColecaoClientes {

	Cliente[] lista = new Cliente[3];
	int total = 0;

	public String listar() {
		return Arrays.toString(this.lista);
	}

	public void cadastrar(Cliente c) {
		aumentaArray();
		this.lista[this.total] = c;
		this.total++;
	}

	public void cadastrarPorPosicao(Cliente c, int posicao) {
		aumentaArray();
		for (int i = this.total - 1; i >= posicao; i--) {
			this.lista[i + 1] = this.lista[i];
		}
		this.lista[posicao] = c;
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

	public Cliente procurarPorNome(String nome) {
		for (int i = 0; i < lista.length - 1; i++) {
			if (this.lista[i].getNome().equals(nome)) {
				return this.lista[i];
			}
		}
		return null;
	}

	public void aumentaArray() {
		if (this.lista.length == this.total) {
			Cliente[] newCliente = new Cliente[this.lista.length * 2];
			System.arraycopy(lista, 0, newCliente, 0, this.lista.length);
			this.lista = newCliente;

		}
	}

}
