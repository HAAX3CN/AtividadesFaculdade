package src.Atividade1;

public class Carro extends Veiculo{
    private final int numeroDePortas;
    private int portasAbertas = 0;

    public Carro(String modelo, int ano, int numdePortas){
        super(modelo, ano);
        this.numeroDePortas = numdePortas;
    }

    public int getNumDePortas(){
        return this.numeroDePortas;
    }

    public int getPortasAbertas(){
        return this.portasAbertas;
    }

    private void incrementarPortasAbertas(){
        this.portasAbertas++;
    }

    public void abrirPortas(){
        if(this.getPortasAbertas() >= this.getNumDePortas()){
            throw new IllegalArgumentException("Todas as portas já estão abertas !");
        }
        this.incrementarPortasAbertas();
        System.out.println("Uma porta foi aberta !");
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Número de portas : "+this.getNumDePortas());
        System.out.println("Portas abertas: " + this.getPortasAbertas());
    }
}
