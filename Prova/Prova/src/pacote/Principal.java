package pacote;

public class Principal {
	
	public static void main(String[] args) {
		
		ColecaoFilial cf = new ColecaoFilial();
		
		Filial f1 = new Filial("oBoticario", "Paulo Afonso");
		Filial f2 = new Filial("Avon", "Petrolandia");
		Filial f3 = new Filial("Natura", "Delmiro Gouveia");
		Filial f4 = new Filial("MariMaria", "Garanhuns");
		
		
		cf.cadastrar(f1);
		cf.cadastrar(f2);
		cf.cadastrar(f3);
		
		System.out.println(cf.listar());
		cf.cadastrarPorPosicao(f4, 1);
		System.out.println(cf.listar());
		
		System.out.println("Filial: "+cf.procurarPorNome("Natura"));
		
		cf.removerPorPosicao(2);
		System.out.println(cf.listar());
		
		/*System.out.println("Lista de Filiais: "+ cf.listar());
		
		cf.removerPorPosicao(0);
		
		System.out.println("Lista de Filiais: "+ cf.listar());
		
		System.out.println("Nome da filial procurada: "+ cf.procurarPorNome("Avon"));*/
		
		ColecaoClientes cc = new ColecaoClientes();
		
		Cliente c1 = new Cliente("Bea", "123123", "231231", f1);
		Cliente c2 = new Cliente("Murilo", "512513", "231231", f1);
		Cliente c3 = new Cliente("Luana", "110233", "231231", f3);
		Cliente c4 = new Cliente("Amanda", "75172", "231231", f4);
		
		cc.cadastrar(c1);
		cc.cadastrar(c2);
		cc.cadastrar(c3);
		cc.cadastrarPorPosicao(c4, 0);		
		
		System.out.println("Lista de Clientes: "+ cc.listar());
		
		cc.removerPorPosicao(0);
		
		System.out.println("Lista de Clientes: "+ cc.listar());
		System.out.println("Nome do cliente procurado: "+ cc.procurarPorNome("Bea"));
		
		
		
		
	}

}
