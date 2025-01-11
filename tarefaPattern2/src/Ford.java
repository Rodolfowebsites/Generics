public class Ford extends Carro{

    public Ford(String modelo) {
        super(modelo);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Ford: " + getmodelo());
    }
}
