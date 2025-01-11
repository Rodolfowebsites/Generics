import java.util.List;
import java.util.ArrayList;

public abstract class Carro {
    private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public String getmodelo() {
        return modelo;
    }

    //Método abstrato que será implementado pelas subclasses
    public abstract void mostrarDetalhes();
}
