package atividade1;

public class TestaVeiculos {
	public static void main(String[] args) {
		Carro carro = new Carro("Sedan", 2023, 4);
		Moto moto = new Moto("Esportiva", 2024, 600);
		
		carro.exibirInformacoes();
		System.out.println("");
		moto.exibirInformacoes();
		System.out.println("");
		
		carro.acelerar(30);
		moto.acelerar(50);
		
		carro.exibirInformacoes();
		System.out.println("");
		moto.exibirInformacoes();
		System.out.println("");
		carro.frear(50);
		moto.frear(20);
		System.out.println("");
		carro.exibirInformacoes();
		System.out.println("");
		moto.exibirInformacoes();
		System.out.println("");
		carro.abrirPortas();
		moto.empinar();
	}
}
