package org.padroesprojeto;

public class SuporteAvancado implements TipoSuporte {

    private static SuporteAvancado instance = new SuporteAvancado();

    private SuporteAvancado() {}

    public static SuporteAvancado getInstance() {
        return instance;
    }
}
