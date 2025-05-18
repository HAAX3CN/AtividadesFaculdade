package atividade1;

public class Carro extends Veiculo{
	private int numeroPortas;
	private int portasAbertas;
	public Carro(String modelo, int ano, int numPortas) {
		super(modelo, ano);
		this.numeroPortas = numPortas;
		this.portasAbertas = 0;
	}
	
	public int getNumeroPortas() {
		return this.numeroPortas;
	}
	
	public void abrirPortas() {
		if(this.portasAbertas < 4) {System.out.println("Uma porta foi aberta!");}
		else {System.out.println("Todas as portas já estão abertas!");}
	}
	
	public void fecharPorta() {
		if(this.portasAbertas < 0) {System.out.println("Uma porta foi fechada!");}
		else {System.out.println("Todas as portas já estão fechadas!");}
	}
	
	@Override
	public void exibirInformacoes() {
		System.out.println("Modelo: "+this.getModelo()+
						 "\nAno: "+this.getAno()+
						 "\nNumero De Portas: "+this.getNumeroPortas()+
						 "\nVelocidade: "+this.getVelocidadeAtual());
	}
}
