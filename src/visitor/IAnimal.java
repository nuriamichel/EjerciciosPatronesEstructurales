package visitor;

public interface IAnimal {
    void definirEnfermedad(IVeterinario visitor, TipoEnfermedad tipoEnfermedad);
}
