package lab5;

public class Facade {

	private Controller controller;

	public void Inicialize(int caixa, double taxa) {
		controller = new Controller(caixa, taxa);
	}

	public int getCaixa() {
		return controller.getCaixa();
	}

	public int cadastrarCenario(String descricao) {
		return controller.cadastrarCenario(descricao);
	}

	public String exibirCenario(int numeracao) {
		return controller.exibeCenario(numeracao);
	}

	public String exibirCenarios() {
		return controller.exibeCenarios();
	}

	public void cadastrasAposta(int cenario, String apostador, int valor, String previsao) {
		controller.cadastrarAposta(cenario, apostador, valor, previsao);
	}

	public int valorTotalDeApostas(int cenario) {
		return controller.valorTotalDeApostas(cenario);
	}

	public int totalDeApostas(int cenario) {
		return controller.totalDeApostas(cenario);
	}
	
	public String exibeApostas(int cenario) {
		return controller.exibeApostas(cenario);
	}
	
	public void fecharAposta(int cenario, boolean ocorreu) {
		controller.fecharAposta(cenario, ocorreu);
	}
}
