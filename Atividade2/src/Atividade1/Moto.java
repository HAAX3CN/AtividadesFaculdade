package src.Atividade1;

public class Moto extends Veiculo{
    private final int cilindradas;
    private boolean motoEmpinada = false;

    public Moto(String modelo, int ano, int cilindradas){
        super(modelo, ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas(){
        return this.cilindradas;
    }

    public boolean isMotoEmpinada(){
        return this.motoEmpinada;
    }

    public void empinar(){
        if(this.isMotoEmpinada()){
            throw new IllegalArgumentException("A moto já está empinada !");
        }
        this.motoEmpinada = true;
        System.out.println("Empinando a moto !");
    }
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Cilindradas : "+this.getCilindradas());
    }
}