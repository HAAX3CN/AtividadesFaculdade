package src.Veiculos;

public class AnoInvalidoException extends Exception{
    private final String Message;
    
    public AnoInvalidoException(){
        this.Message = "Erro: Ano invalido !";
    }

    public AnoInvalidoException(String message){
        this.Message = message;
    }

    @Override
    public String getMessage(){
        return this.Message;
    }
}