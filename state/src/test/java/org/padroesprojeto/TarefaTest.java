package org.padroesprojeto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TarefaTest {

    @Test
    void deveIniciarTarefaNaoIniciada() {
        Tarefa tarefa = new Tarefa();
        assertEquals("Não Iniciada", tarefa.getNomeEstado());

        tarefa.iniciar();
        assertEquals("Em Progresso", tarefa.getNomeEstado());
    }

    @Test
    void naoDeveIniciarTarefaEmProgresso() {
        Tarefa tarefa = new Tarefa();
        tarefa.iniciar();  // Estado muda para "Em Progresso"

        assertFalse(tarefa.iniciar());  // Já está em progresso, não pode iniciar novamente
        assertEquals("Em Progresso", tarefa.getNomeEstado());
    }

    @Test
    void devePausarTarefaEmProgresso() {
        Tarefa tarefa = new Tarefa();
        tarefa.iniciar();  // Estado muda para "Em Progresso"

        assertTrue(tarefa.pausar());
        assertEquals("Pausada", tarefa.getNomeEstado());
    }

    @Test
    void naoDevePausarTarefaNaoIniciada() {
        Tarefa tarefa = new Tarefa();
        assertFalse(tarefa.pausar());  // Não pode pausar se a tarefa não foi iniciada
        assertEquals("Não Iniciada", tarefa.getNomeEstado());
    }

    @Test
    void deveReiniciarTarefaPausada() {
        Tarefa tarefa = new Tarefa();
        tarefa.iniciar();  // Estado muda para "Em Progresso"
        tarefa.pausar();   // Estado muda para "Pausada"

        assertTrue(tarefa.iniciar());  // Pode reiniciar uma tarefa pausada
        assertEquals("Em Progresso", tarefa.getNomeEstado());
    }

    @Test
    void deveConcluirTarefaEmProgresso() {
        Tarefa tarefa = new Tarefa();
        tarefa.iniciar();  // Estado muda para "Em Progresso"

        assertTrue(tarefa.concluir());
        assertEquals("Concluída", tarefa.getNomeEstado());
    }

    @Test
    void naoDeveConcluirTarefaNaoIniciada() {
        Tarefa tarefa = new Tarefa();
        assertFalse(tarefa.concluir());  // Não pode concluir se a tarefa não foi iniciada
        assertEquals("Não Iniciada", tarefa.getNomeEstado());
    }

    @Test
    void naoDeveMudarEstadoDepoisDeConcluida() {
        Tarefa tarefa = new Tarefa();
        tarefa.iniciar();  // Estado muda para "Em Progresso"
        tarefa.concluir(); // Estado muda para "Concluída"

        assertFalse(tarefa.pausar());  // Não pode pausar uma tarefa concluída
        assertFalse(tarefa.iniciar()); // Não pode iniciar uma tarefa concluída
        assertEquals("Concluída", tarefa.getNomeEstado());
    }
}