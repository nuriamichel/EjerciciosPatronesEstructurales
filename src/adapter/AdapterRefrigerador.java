package adapter;

public class AdapterRefrigerador implements IElectrico {

    private Refrigeradoras adaptee;

    public AdapterRefrigerador(Refrigeradoras adaptee) {
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
