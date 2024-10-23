package org.padroesprojeto;

public class SuporteEspecializado implements TipoSuporte {

    private static SuporteEspecializado instance = new SuporteEspecializado();

    private SuporteEspecializado() {}

    public static SuporteEspecializado getInstance() {
        return instance;
    }
}
