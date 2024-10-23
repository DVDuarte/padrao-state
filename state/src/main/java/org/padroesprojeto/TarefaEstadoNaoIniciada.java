package org.padroesprojeto;

public class TarefaEstadoNaoIniciada extends TarefaEstado {

    private TarefaEstadoNaoIniciada() {}
    private static TarefaEstadoNaoIniciada instance = new TarefaEstadoNaoIniciada();

    public static TarefaEstadoNaoIniciada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Não Iniciada";
    }

    public boolean iniciar(Tarefa tarefa) {
        tarefa.setEstado(TarefaEstadoEmProgresso.getInstance());
        return true;
    }
}