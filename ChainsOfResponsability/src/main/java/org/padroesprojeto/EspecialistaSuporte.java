package org.padroesprojeto;

public class EspecialistaSuporte extends FuncionarioSuporte {

    public EspecialistaSuporte(FuncionarioSuporte superior) {
        listaSuportes.add(SuporteEspecializado.getInstance());
        setSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Especialista de Suporte";
    }
}
