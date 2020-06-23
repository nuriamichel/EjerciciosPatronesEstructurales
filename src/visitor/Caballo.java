package visitor;

public class Caballo implements IAnimal {

    @Override
    public void definirEnfermedad(IVeterinario visitor, TipoEnfermedad tipoEnfermedad) {
        visitor.recetarCura(this, tipoEnfermedad);


    }
}
