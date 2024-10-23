package org.padroesprojeto;

public abstract class TarefaEstado {

    public abstract String getEstado();

    public boolean iniciar(Tarefa tarefa) {
        return false;
    }

    public boolean pausar(Tarefa tarefa) {
        return false;
    }

    public boolean concluir(Tarefa tarefa) {
        return false;
    }
}
