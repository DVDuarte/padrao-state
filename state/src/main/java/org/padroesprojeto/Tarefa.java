package org.padroesprojeto;

public class Tarefa {

    private String descricao;
    private TarefaEstado estado;

    public Tarefa() {
        this.estado = TarefaEstadoNaoIniciada.getInstance();
    }

    public void setEstado(TarefaEstado estado) {
        this.estado = estado;
    }

    public boolean iniciar() {
        return estado.iniciar(this);
    }

    public boolean pausar() {
        return estado.pausar(this);
    }

    public boolean concluir() {
        return estado.concluir(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TarefaEstado getEstado() {
        return estado;
    }
}