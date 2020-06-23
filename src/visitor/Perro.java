package visitor;

public class Perro implements IAnimal {

    @Override
    public void definirEnfermedad(IVeterinario visitor, TipoEnfermedad tipoEnfermedad) {
        visitor.recetarCura(this, tipoEnfermedad);

    }
}
