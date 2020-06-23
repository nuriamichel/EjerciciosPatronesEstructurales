package visitor;

public interface IVeterinario {

    void recetarCura(Caballo caballo, TipoEnfermedad tipoEnfermedad);
    void recetarCura(Perro perro, TipoEnfermedad tipoEnfermedad);
    void recetarCura(Gato gato, TipoEnfermedad tipoEnfermedad);

}
