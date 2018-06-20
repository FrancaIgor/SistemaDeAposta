package lab5;

public class Aposta {
	private String nomeDoApostador;
	private int valor;
	private String previsao;

	public Aposta(String nomeDoApostador, int valor, String previsao) {
		this.nomeDoApostador = nomeDoApostador;
		this.valor = valor;
		this.previsao = previsao;
	}

	public int getValor() {
		return this.valor;
	}
	
	public String toString() {
		return this.nomeDoApostador + " - R$" + this.valor + " - " + this.previsao;
	}
}
