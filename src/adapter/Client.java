package adapter;

public class Client {

    public static void main(String[] args) {

        Televisores televisores = new Televisores();
        Lavadoras lavadoras = new Lavadoras();
        Refrigeradoras refrigeradoras = new Refrigeradoras();

        AdapterTelevisor adapterTelevisor = new AdapterTelevisor(televisores);
        AdapterLavadora adapterLavadora = new AdapterLavadora(lavadoras);
        AdapterRefrigerador adapterRefrigerador = new AdapterRefrigerador(refrigeradoras);

        Celulares celulares = new Celulares();
        System.out.println("Celular");
        celulares.tiempoDeVida(1);
        celulares.precio(2000);

        Tablets tablets = new Tablets();
        System.out.println("Tablet");
        tablets.tiempoDeVida(2);
        tablets.precio(4000);

        Computadoras computadoras = new Computadoras();
        System.out.println("Computadora");
        computadoras.tiempoDeVida(3);
        computadoras.precio(6000);


        System.out.println("Televisión");
        adapterTelevisor.tiempoDeVida(4);
        adapterTelevisor.precio(10000);

        System.out.println("Lavadora");
        adapterLavadora.tiempoDeVida(5);
        adapterLavadora.precio(15000);

        System.out.println("Refrigerador");
        adapterRefrigerador.tiempoDeVida(6);
        adapterRefrigerador.precio(20000);
    }

}
