package atividade1;

public class Moto extends Veiculo {
	private int cilindradas;
	
	public Moto(String modelo, int ano, int cilindradas) {
		super(modelo, ano);
		this.cilindradas = cilindradas;
	}
	
	public int getCilindradas() {
		return this.cilindradas;
	}
	
	public void empinar() {
		System.out.println("Chamando no grau!!!");
	}
	
	@Override
	public void exibirInformacoes() {
		System.out.println("Modelo: "+this.getModelo()+
						 "\nAno: "+this.getAno()+
						 "\nCilindradas: "+this.getCilindradas()+
						 "\nVelocidade: "+this.getVelocidadeAtual());
		
	}
}
