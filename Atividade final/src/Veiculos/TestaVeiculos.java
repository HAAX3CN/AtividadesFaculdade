package src.Veiculos;

public class TestaVeiculos {

	public static void espaco(){
        System.out.println("\n---------------------------------\n");
    }
	
	public static void main(String[] args) {
		try{

			Carro carro = new Carro("Sedan", 2023, 4);
			Moto moto = new Moto("Esportiva", 2024, 600);
			
			carro.exibirInformacoes();
			espaco();
			moto.exibirInformacoes();
			espaco();
			
			SimuladorViagem simuladorCarro = new SimuladorViagem(carro);
			SimuladorViagem simuladorMoto = new SimuladorViagem(moto);

			Thread thhCarro = new Thread(simuladorCarro);
			Thread thhMoto = new Thread(simuladorMoto);

			thhCarro.start();
			thhMoto.start();

			thhCarro.join();
			thhMoto.join();

			espaco();
			System.out.println("Todas as viagens foram concluídas.");

		} catch(AnoInvalidoException | IllegalArgumentException e) {
			System.out.println("Erro: "+ e.getMessage());
		} catch(InterruptedException e) {
			System.out.println("Erro de interrupção: "+ e.getMessage());
		} 
	}
}