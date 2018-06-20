package lab5;

import java.util.ArrayList;

public class Controller {
	private int caixa;
	private double taxa;
	private Cenario cenario;
	private ArrayList<Cenario> cenarios;

	public Controller(int caixa, double taxa) {
		this.caixa = caixa;
		this.taxa = taxa;
	}

	public int getCaixa() {
		return this.caixa;
	}

	public int cadastrarCenario(String descricao) {
		cenarios.add(new Cenario(descricao));
		return cenarios.size();
	}

	public String exibeCenario(int numCenario) {
		return cenarios.get(numCenario).toString();
	}

	public String exibeCenarios() {
		String listando = "";
		for (int i = 0; i < cenarios.size(); i++) {
			listando += i + 1 + " - " + cenarios.get(i).toString() + System.lineSeparator();
		}
		return listando;
	}

	public void cadastrarAposta(int cenario, String apostador, int valor, String previsao) {
		cenarios.get(cenario).cadastraAposta(apostador, valor, previsao);
	}

	public int valorTotalDeApostas(int cenario) {
		return cenarios.get(cenario).valorTotalDeApostas();
	}
	
	public int totalDeApostas(int cenario) {
		return cenarios.get(cenario).totalDeApostas();
	}
	
	public String exibeApostas(int cenario) {
		return cenarios.get(cenario).exibeApostas();
	}
	
	public void fecharAposta(int cenario,boolean ocorreu) {
		cenarios.get(cenario).fecharAposta(ocorreu);
	}
}
