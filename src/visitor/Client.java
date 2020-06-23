package visitor;

public class Client {

    public static void main (String []args  ){
        Caballo caballo = new Caballo();
        Perro perro = new Perro();
        Gato gato = new Gato();

        Veterinario visitor= new Veterinario();


        caballo.definirEnfermedad(visitor, TipoEnfermedad.ENFERMEDAD1);
        caballo.definirEnfermedad(visitor, TipoEnfermedad.ENFERMEDAD2);


        gato.definirEnfermedad(visitor, TipoEnfermedad.ENFERMEDAD1);
        gato.definirEnfermedad(visitor, TipoEnfermedad.ENFERMEDAD2);


        perro.definirEnfermedad(visitor, TipoEnfermedad.ENFERMEDAD1);
        perro.definirEnfermedad(visitor, TipoEnfermedad.ENFERMEDAD2);

    }
}
