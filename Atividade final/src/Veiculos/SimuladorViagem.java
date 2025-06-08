package src.Veiculos;

import java.util.Random;

public class SimuladorViagem implements Runnable{   
    private final Veiculo veiculo;
    private final Random random = new Random();
    
    public static void espaco(){
        System.out.println("\n---------------------------------\n");
    }

    public SimuladorViagem(Veiculo veiculo){
        this.veiculo = veiculo;
    }

    @Override
    public void run() {
        System.out.println("Viagem iniciada com o veículo: "+veiculo.getModelo());

        for (int i = 1; i <= 5; i++){
            espaco();
            try {
                double incremento = 5 + random.nextInt(11);
                veiculo.acelerar(incremento);
                System.out.println(veiculo.getModelo() + " acelerou para "+ veiculo.getVelocidadeAtual()+" km/h");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrompida: "+ e.getMessage());
            } catch (IllegalArgumentException e){
                System.out.println("Erro: "+ e.getMessage());
            }
        }

        try {
            veiculo.frear(veiculo.getVelocidadeAtual());
            System.out.println("Viagem finalizada com o veículo: "+veiculo.getModelo());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao frear: "+ e.getMessage());
        }
    }
}
