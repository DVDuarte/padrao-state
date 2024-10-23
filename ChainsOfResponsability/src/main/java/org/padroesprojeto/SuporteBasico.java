package org.padroesprojeto;

public class SuporteBasico implements TipoSuporte {

    private static SuporteBasico instance = new SuporteBasico();

    private SuporteBasico() {}

    public static SuporteBasico getInstance() {
        return instance;
    }
}
