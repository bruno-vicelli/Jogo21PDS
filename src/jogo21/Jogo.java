/**
 * <copyright>
 *
 * Copyright 2012 Burno Vicelli <brunodosax@hotmail.com> * Este programa e todos
 * os materiais que o acompanham estão disponibilizados sob a licença GPL versão
 * 3, que acompanha esta distribuição e está disponível em
 * http://www.gnu.org/licenses/gpl.html </copyright>
 */
package jogo21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe Jogo que implementa as características do jogo21
 *
 * Universidade Federal do Pampa Graduação: Engenharia de Software Disciplina:
 * Práticas de Desenvolvimento de Software Professor: Wagner de Melo Reck
 * Semestre: 5° - 2012/01
 *
 * @author Bruno Vicelli
 * @Version 1.0 @Date 27/09/2012
 */
public class Jogo {

    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador jogadorDaVez;

    /**
     * Método construtor da classe Jogo
     *
     * @param jogador1
     * @param jogador2
     */
    public Jogo(Jogador jogador1, Jogador jogador2) {

        System.out.println("-------------JOGO INICIADO-------------");
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.jogadorDaVez = jogador2;
    }

    /**
     * Método que calcula a pontuação dos jogadores
     *
     * @param jogador
     * @return
     */
    public int calculaPontuacao(Jogador jogador) {
        int pontuacao = 0;
        for (int i = 0; i < jogador.getMaoDoJogador().size(); i++) {
            switch (jogador.getMaoDoJogador().get(i).getNumero()) {
                case ("A"):
                    pontuacao = pontuacao + 1;
                    break;

                case ("J"):
                    pontuacao = pontuacao + 10;
                    break;

                case ("Q"):
                    pontuacao = pontuacao + 10;
                    break;

                case ("K"):
                    pontuacao = pontuacao + 10;
                    break;

                default:
                    int aInt = Integer.parseInt(jogador.getMaoDoJogador().get(i).getNumero());
                    pontuacao = pontuacao + aInt;
                    break;
            }
        }

        return pontuacao;
    }

    /**
     * Método para verificar quem venceu. No caso os jogadores vão pegando
     * cartas até que um dos jogadores estoure 21 pontos
     *
     * @param jogador1
     * @param jogador2
     */
    public Jogador verificaVencedor(Jogador jogador1, Jogador jogador2) {
        if (calculaPontuacao(jogador1) == 21 && calculaPontuacao(jogador2) < 21) {
            System.out.println(jogador1.getNome() + " venceu!");
            return jogador1;
        } else if (calculaPontuacao(jogador2) == 21 && calculaPontuacao(jogador1) < 21) {
            System.out.println(jogador2.getNome() + " venceu!");
            return jogador2;
        } else if (calculaPontuacao(jogador1) > 21 && calculaPontuacao(jogador2) <= 21) {
            System.out.println(jogador2.getNome() + " venceu!");
            return jogador2;
        } else if (calculaPontuacao(jogador1) <= 21 && calculaPontuacao(jogador2) > 21) {
            System.out.println(jogador1.getNome() + " venceu!");
            return jogador1;
        } else if (calculaPontuacao(jogador1) == 21 && calculaPontuacao(jogador2) == 21) {
            System.out.println("EMPATOU O JOGO!");
        }

        return null;

    }

    /**
     * Método que troca o jogador a cada rodada
     *
     * @return
     * @throws Exception
     */
    public Jogador trocaJogador() throws Exception {
        if (jogadorDaVez.equals(jogador1)) {
            jogadorDaVez = jogador2;
        } else if (jogadorDaVez.equals(jogador2)) {
            jogadorDaVez = jogador1;
        } else {
            throw new Exception("ERRO");
        }
        return jogadorDaVez;
    }

    /**
     * Método para definir os nomes dos jogadores no jogo
     *
     * @param jogador1
     * @param jogador2
     */
    public void defineNomeJogador(Jogador jogador1, Jogador jogador2) {

        BufferedReader entrada;
        entrada = new BufferedReader(new InputStreamReader(System.in));
        String resposta = "";

        System.out.println("Digite o nome do jogador 1: ");
        try {
            resposta = entrada.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
        }
        jogador1.setNome(resposta);

        System.out.println("Digite o nome do jogador 2: ");
        try {
            resposta = entrada.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
        }
        jogador2.setNome(resposta);

    }
}
