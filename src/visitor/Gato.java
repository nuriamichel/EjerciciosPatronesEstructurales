package visitor;

public class Gato implements IAnimal {

    @Override
    public void definirEnfermedad(IVeterinario visitor, TipoEnfermedad tipoEnfermedad) {
        visitor.recetarCura(this, tipoEnfermedad);

    }

}
