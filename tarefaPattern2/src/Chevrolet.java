public class Chevrolet extends Carro{

    public Chevrolet(String modelo){
        super(modelo);
    }

    @Override
    public void mostrarDetalhes(){
        System.out.println("Chevrolet: " + getmodelo());
    }

}
