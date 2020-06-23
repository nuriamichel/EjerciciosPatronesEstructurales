package adapter;

public class Tablets implements IElectrico {
    @Override
    public void precio(int precio) {

        System.out.println("El precio es: " + precio);
    }

    @Override
    public void tiempoDeVida(int tiempoDeVida) {

        System.out.println("El tiempo de vida es: " + tiempoDeVida);
    }
}
