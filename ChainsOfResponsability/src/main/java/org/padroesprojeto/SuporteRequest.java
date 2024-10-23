package org.padroesprojeto;

public class SuporteRequest {

    private TipoSuporte tipoSuporte;

    public SuporteRequest(TipoSuporte tipoSuporte) {
        this.tipoSuporte = tipoSuporte;
    }

    public TipoSuporte getTipoSuporte() {
        return tipoSuporte;
    }

    public void setTipoSuporte(TipoSuporte tipoSuporte) {
        this.tipoSuporte = tipoSuporte;
    }
}