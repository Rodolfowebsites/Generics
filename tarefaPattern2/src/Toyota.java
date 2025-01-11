public class Toyota extends Carro{

    public Toyota(String modelo) {
        super(modelo);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Toyota: " + getmodelo());
    }
}
