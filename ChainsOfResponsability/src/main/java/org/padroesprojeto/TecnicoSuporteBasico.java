package org.padroesprojeto;

public class TecnicoSuporteBasico extends FuncionarioSuporte {

    public TecnicoSuporteBasico(FuncionarioSuporte superior) {
        listaSuportes.add(SuporteBasico.getInstance());
        setSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Técnico de Suporte Básico";
    }
}
