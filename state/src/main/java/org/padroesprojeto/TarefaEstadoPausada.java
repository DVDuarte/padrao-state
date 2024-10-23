package org.padroesprojeto;

public class TarefaEstadoPausada extends TarefaEstado {

    private TarefaEstadoPausada() {}
    private static TarefaEstadoPausada instance = new TarefaEstadoPausada();

    public static TarefaEstadoPausada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pausada";
    }

    public boolean iniciar(Tarefa tarefa) {
        tarefa.setEstado(TarefaEstadoEmProgresso.getInstance());
        return true;
    }

    public boolean concluir(Tarefa tarefa) {
        tarefa.setEstado(TarefaEstadoConcluida.getInstance());
        return true;
    }
}