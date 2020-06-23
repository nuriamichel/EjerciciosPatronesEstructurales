package visitor;

import java.util.Date;

public class Veterinario implements IVeterinario {
    @Override
    public void recetarCura(Caballo caballo, TipoEnfermedad tipoEnfermedad) {

        if (tipoEnfermedad.name().equals(TipoEnfermedad.ENFERMEDAD1.name())) {

            System.out.println(" Recentando cura para " + tipoEnfermedad.name());
            System.out.println("Hora de la curación: " + new Date().toString());
        } else {

            System.out.println(" Recentando cura para " + tipoEnfermedad.name());
            System.out.println("Hora de la curación: " + new Date().toString());
        }

    }

    @Override
    public void recetarCura(Perro perro, TipoEnfermedad tipoEnfermedad) {

        if (tipoEnfermedad.name().equals(TipoEnfermedad.ENFERMEDAD1.name())) {
            System.out.println(" Recentando cura para " + tipoEnfermedad.name());
            System.out.println("Hora de la curación: " + new Date().toString());
        } else {
            System.out.println(" Recentando cura para " + tipoEnfermedad.name());
            System.out.println("Hora de la curación: " + new Date().toString());
        }

    }

    @Override
    public void recetarCura(Gato gato, TipoEnfermedad tipoEnfermedad) {

        if (tipoEnfermedad.name().equals(TipoEnfermedad.ENFERMEDAD1.name())) {
            System.out.println(" Recentando cura para " + tipoEnfermedad.name());
            System.out.println("Hora de la curación: " + new Date().toString());
        } else {
            System.out.println(" Recentando cura para " + tipoEnfermedad.name());
            System.out.println("Hora de la curación: " + new Date().toString());
        }

    }
}
