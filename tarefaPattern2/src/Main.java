import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<>();

        carros.add(new Toyota("Corolla"));
        carros.add(new Ford("Focus"));
        carros.add(new Chevrolet("Camaro"));

        for (Carro carro : carros) {
            carro.mostrarDetalhes();
        }

    }
}