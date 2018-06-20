package lab5;

import java.util.ArrayList;

public class Cenario {
	private String descricao;
	private String estado;
	private ArrayList<Aposta> apostas;
	
	public Cenario(String descricao) {
		this.descricao = descricao;
		estado = "Não finalizado";
		apostas = new ArrayList<>();
	}

	public String toString() {
		return this.descricao + " " + this.estado;
	}

	public void cadastraAposta(String apostador, int valor, String previsao) {
		apostas.add(new Aposta(apostador, valor, previsao));
	}

	public int valorTotalDeApostas() {
		int count = 0;
		for (int i = 0; i < apostas.size(); i++) {
			count += apostas.get(i).getValor();
		}
		return count;
	}
	
	public int totalDeApostas() {
		int count = 0;
		for (int i = 0; i < apostas.size(); i++) {
			count += 1;
		}
		return count;
	}
	
	public String exibeApostas() {
		String listando = "";
		for (int i = 0; i < apostas.size(); i++) {
			listando += i + 1 + " - " + apostas.get(i).toString() + System.lineSeparator();
		}
		return listando;
	}
	
	public void fecharAposta(boolean ocorreu) {
		if(ocorreu) {
			this.estado = "Finalizado(ocorreu)";
		}else {
			this.estado = "Finalizado(não ocorreu)";
		}
	}
}
