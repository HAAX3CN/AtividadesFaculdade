package atividade1;

public class Veiculo {
	private String modelo;
	private int ano;
	private double velocidadeAtual;
	
	public Veiculo(String modelo, int ano) {
		this.modelo = modelo;
		this.ano = ano;
		this.velocidadeAtual = 0.0;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public int getAno() {
		return this.ano;
	}
	public double getVelocidadeAtual() {
		return this.velocidadeAtual;
	}
	public void acelerar(double incremento) {
		if(incremento <= 0) {
			System.out.println("Não é possivel incremetar negativamente!");
		}else {
		this.velocidadeAtual += incremento;
		}
	}
	public void frear(double decremento) {
		if(decremento <= 0 || decremento > this.velocidadeAtual) {
			 System.out.println("Erro! Não é possível frear negativamente!");
		}
		else {
		this.velocidadeAtual -= decremento;
		}
	}
	public void exibirInformacoes() {
		String modelo = this.getModelo();
		int ano = this.getAno();
		double velocidade = this.getVelocidadeAtual();
		System.out.println("Modelo: "+modelo+"\nAno: "+ano+"\nVelocidade: "+velocidade);
	}
	
	/*public static void main(String[] args) {
		Veiculo v1 = new Veiculo("Shevete", 1994);
		v1.acelerar(10.0);
		v1.frear(50);
		v1.exibirInformacoes();
	}*/
}
