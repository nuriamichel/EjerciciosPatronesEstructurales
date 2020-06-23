package adapter;

public class AdapterTelevisor implements IElectrico {

    private Televisores adaptee;

    public AdapterTelevisor(Televisores adaptee) {
        this.adaptee = adaptee;
    }


    @Override
    public void precio(int precio) {
        this.adaptee.costo(precio);
    }

    @Override
    public void tiempoDeVida(int tiempoDeVida) {
        this.adaptee.tiempoDeGarantia(tiempoDeVida);
    }
}
