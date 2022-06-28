package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/bsm")

public class BsmController {

	@GetMapping
    public String bsm() {
        return "BSM's Generation Brasil:\n"
                + "BSM-0 - Sessão 1: Introdução às Competências Comportamentais e Mentalidades (35 minutos)\n\n"
                + "BSM-GM - Sessão 1: Introdução à Mentalidade de Crescimento (45 minutos)\n"
                + "BSM-GM - Sessão 2: A Mentalidade de Crescimento e o Cérebro (60 minutos)\n"
                + "BSM-GM - Sessão 3: Praticando e Refletindo a Respeito da Mentalidade de Crescimento (20 minutos)\n\n"
                + "BSM-P - Sessão 1: Introdução à Persistência (45 minutos)\n"
                + "BSM-P - Sessão 2: Persistência e Sua Zona de Conforto (60 minutos)\n\n"

                + "BSM-PR - Sessão 1: O Poder da Responsabilidade Pessoal (45 minutos)\n"
                + "BSM-PR - Sessão 2: Colocando em Prática a Responsabilidade Pessoal (60 minutos)\n\n"
                + "BSM-FO - Sessão 1: Introdução à Orientação ao Futuro (45 minutos)\n"
                + "BSM-FO - Sessão 2: Praticando a Orientação ao Futuro (45 minutos)\n\n"
                + "BSM-C - Sessão 1: Introdução à Comunicação (45 minutos)\n"
                + "BSM-C - Sessão 2: Seja um Bom Comunicador/a (60 minutos)\n\n"
                + "BSM-OD - Sessão 1: Introdução à Orientação ao Detalhe (30 minutos)\n"
                + "BSM-OD - Sessão 2: Demonstrando Orientação ao Detalhe (30 minutos)\n\n"
                + "BSM-PA - Sessão 1: Introdução à Proatividade (45 minutos)\n"
                + "BSM-PA - Sessão 2: Seja Proativo! (60 minutos)\n\n" 
                + "BSM-T - Sessão 1: Introdução ao Trabalho em Equipe (55 minutos)\n"
                + "BSM-T - Sessão 2: Trabalho em Equipe na Prática (50 minutos)\n\n"
                + "C-GG -Sessão 1: Dar e Receber (45 minutos)\n\n"
                + "SA-CS1 - Sessão 1: Força de Trabalho Distribuída (30 minutos)\n\n"
                + "SA-CS1 - Sessão 1: Entregável Urgente (30 minutos)\n\n"
                + "SA-CS3 - Sessão 1: Novas Habilidades Necessárias (30 minutos)\n\n"
                + "SA-CS4 - Sessão 1: Aprender e Compartilhar (30 minutos)\n\n"
                + "SSM-TM -Sessão 1: Introdução à Gestão do Tempo (60 minutos)\n"
                + "SSM-TM - Sessão 2: Aplicando Estratégias Eficazes de Gestão do Tempo (60 minutos)\n\n"
                + "SSM-IV - Sessão 1: Introdução à Forças de Caráter VIA (75 minutos)\n"
                + "SSM-IV - Sessão 2: Maximizar Suas Forças (75 minutos)\n\n"
                + "SSM-RLW - Sessão 1: Introdução à Aprendizagem Online (35 minutos)\n"
                + "SSM-RLW - Sessão 2: Mantendo-se Conectado Enquanto Trabalha À Distância (15 minutos)\n"
                + "SSM-RLW - Sessão 3: Planejando para Vencer (15 minutos)\n"
                + "SSM-RLW - Sessão 4: Vencendo juntos (30 minutos)";
    }
}
