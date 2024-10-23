package org.padroesprojeto;

public class TecnicoSuporteAvancado extends FuncionarioSuporte {

    public TecnicoSuporteAvancado(FuncionarioSuporte superior) {
        listaSuportes.add(SuporteAvancado.getInstance());
        setSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Técnico de Suporte Avançado";
    }
}