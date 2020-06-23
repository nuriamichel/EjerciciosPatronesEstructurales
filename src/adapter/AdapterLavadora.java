package adapter;

public class AdapterLavadora implements IElectrico {

    private Lavadoras adaptee;

    public AdapterLavadora(Lavadoras adaptee) {
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
