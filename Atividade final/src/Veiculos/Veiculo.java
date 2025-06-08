package src.Veiculos;

public class Veiculo {
	private final String modelo;
	private final int ano;
	private double velocidadeAtual;
	
	
	public Veiculo(String modelo, int ano) throws AnoInvalidoException{
		if(ano < 1900){
			throw new AnoInvalidoException("Ano invalido ! o ano deve ser maior ou igual a 1900");
		}
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

    private void setVelocidadeAtual(double novaVelocidade){
        this.velocidadeAtual = novaVelocidade;
    }
    
	public void acelerar(double incremento) {
		if(incremento <= 0) {
			throw new IllegalArgumentException("Não é possível incrementar negativamente!");
		}
        double novaVelocidade = this.getVelocidadeAtual() + incremento;
        this.setVelocidadeAtual(novaVelocidade);
		
        
	}

	public void frear(double decremento) {
		if(decremento <= 0 ){
            throw new IllegalArgumentException("Erro! O decremento não pode ser negativo !");
        }
        if(decremento > this.velocidadeAtual) {
			throw new IllegalArgumentException("Erro! O decremento não pode ser maior que a velocidade atual !");
		}
        double novaVelocidade = this.getVelocidadeAtual() - decremento;
        this.setVelocidadeAtual(novaVelocidade);
		
	}

	public void exibirInformacoes() {
    System.out.println("Modelo: " + this.getModelo());
    System.out.println("Ano: " + this.getAno());
    System.out.println("Velocidade Atual: " + this.getVelocidadeAtual() + " km/h");
    }
}