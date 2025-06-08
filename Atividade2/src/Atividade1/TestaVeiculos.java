package src.Atividade1;

public class TestaVeiculos {
    public static void espaco(){
        System.out.println("\n---------------------------------\n");
    }

	public static void main(String[] args) {
        

		Carro carro = new Carro("Sedan", 2023, 4);
		Moto moto = new Moto("Esportiva", 2024, 600);
		
		carro.exibirInformacoes();
		espaco();
		moto.exibirInformacoes();
		espaco();
		
		carro.acelerar(30);
		moto.acelerar(50);
		
		carro.exibirInformacoes();
		espaco();
		moto.exibirInformacoes();
		
		carro.frear(50);
		moto.frear(20);

		carro.exibirInformacoes();
		espaco();
		moto.exibirInformacoes();
		espaco();
		carro.abrirPortas();
		moto.empinar();
	}
}