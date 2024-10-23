package org.padroesprojeto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuporteTest {

    FuncionarioSuporte especialista;
    FuncionarioSuporte tecnicoAvancado;
    FuncionarioSuporte tecnicoBasico;

    @BeforeEach
    void setUp() {
        especialista = new EspecialistaSuporte(null);
        tecnicoAvancado = new TecnicoSuporteAvancado(especialista);
        tecnicoBasico = new TecnicoSuporteBasico(tecnicoAvancado);
    }

    @Test
    void deveRetornarTecnicoSuporteBasicoParaSolicitacaoBasica() {
        assertEquals("Técnico de Suporte Básico", tecnicoBasico.resolverSolicitacao(new SuporteRequest(SuporteBasico.getInstance())));
    }

    @Test
    void deveRetornarTecnicoSuporteAvancadoParaSolicitacaoAvancada() {
        assertEquals("Técnico de Suporte Avançado", tecnicoBasico.resolverSolicitacao(new SuporteRequest(SuporteAvancado.getInstance())));
    }

    @Test
    void deveRetornarEspecialistaSuporteParaSolicitacaoEspecializada() {
        assertEquals("Especialista de Suporte", tecnicoBasico.resolverSolicitacao(new SuporteRequest(SuporteEspecializado.getInstance())));
    }

    @Test
    void deveRetornarSemSuporteParaSolicitacaoInexistente() {
        // Vamos simular uma requisição que não pertence a nenhum tipo de suporte existente
        TipoSuporte tipoInvalido = new TipoSuporte() {};
        assertEquals("Solicitação não pode ser resolvida.", tecnicoBasico.resolverSolicitacao(new SuporteRequest(tipoInvalido)));
    }
}

