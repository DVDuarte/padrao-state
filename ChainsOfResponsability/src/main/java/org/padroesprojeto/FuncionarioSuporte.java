package org.padroesprojeto;

import java.util.ArrayList;

public abstract class FuncionarioSuporte {

    protected ArrayList<TipoSuporte> listaSuportes = new ArrayList<>();
    private FuncionarioSuporte superior;

    public FuncionarioSuporte getSuperior() {
        return superior;
    }

    public void setSuperior(FuncionarioSuporte superior) {
        this.superior = superior;
    }

    public abstract String getDescricaoCargo();

    public String resolverSolicitacao(SuporteRequest request) {
        if (listaSuportes.contains(request.getTipoSuporte())) {
            return getDescricaoCargo();
        } else {
            if (superior != null) {
                return superior.resolverSolicitacao(request);
            } else {
                return "Solicitação não pode ser resolvida.";
            }
        }
    }
}
